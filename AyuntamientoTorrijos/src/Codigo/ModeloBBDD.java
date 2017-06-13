package Codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

import javax.swing.JComboBox;

public class ModeloBBDD implements Modelo {

	private VistaWB vista;
	private VistaAuxTabla vista2;
	private Properties datos;
	private File miFichero;
	private InputStream entrada;
	private final String FILE = "Fichero.ini";
	private Connection conexion;
	private Statement stmt;
	public String tabla[][] = null;
	public String tabla2[][] = null;
	private String bd, login, pwd;
	
	
	
	///////////////////////////////////////////////////////////////
	//---------------------CONEXION----------------------------///
	///////////////////////////////////////////////////////////////
	
	
	
	
	

	public void Conexion(String bd, String login, String pwd) {
		this.bd = bd;
		this.login = login;
		this.pwd = pwd;
		getConnection();
	}

	public Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(bd, login, pwd);
			return conexion;
		} catch (Exception e) {
			return null;

		}
	}
	
	
	
	
	
	
	
	
	public void refrescar() {

		this.Consulta(
				"SELECT * FROM actividad join relactper on actividad.id = relactper.idAct JOIN interesado on relactper.idInt = interesado.id");
		vista.setDatosTabla();
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////
	//---------------------CONSULTAS----------------------------///
	///////////////////////////////////////////////////////////////
	

	

	public void Consulta(String Query) {
		//vista.clear_Table();
		String query = Query;

		try {
			PreparedStatement stmt;
			stmt = conexion.prepareStatement(query);

			int cont = 0;

			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rset.getMetaData();
			while (rset.next()) {
				cont += 1;
				System.out.println(rset);
			}
			rset = stmt.executeQuery(query);

			int cont2 = 0;
			tabla = new String[cont][rsmd.getColumnCount()];
			// System.out.println("-----------------------");
			// System.out.println(rsmd.getColumnCount());

			while (rset.next()) {
				String fila[] = new String[rsmd.getColumnCount()];
				fila[0] = rset.getString("id");
				fila[1] = rset.getString("interesado.nombre");
				fila[2] = rset.getString("interesado.apellidos");
				fila[3] = rset.getString("tipo");
				fila[4] = rset.getString("interesado.cif");
				fila[5] = rset.getString("referenciaCatastral");


				tabla[cont2] = fila;

				cont2++;

			}
			vista.setDatosTabla();
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	public String[][] getTabla() {
		tabla2 = new String[tabla.length][5];
		// System.out.println(tabla[0].length);
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {
				if (j < 5) {
					tabla2[i][j] = tabla[i][j];
				}
				System.out.println(tabla[i][j]);
			}
		}
		return tabla;
	}

	public void setTabla(String[][] tabla) {
		this.tabla = tabla;
	}

	@Override
	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}
	
	
	public void setVista2(VistaAuxTabla vista){
		this.vista2 = vista;
	}

	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////
	//---------------------INNSERTS----------------------------///
	///////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	public int insertarRepresentante(String txtfNombreR, String txtfApellidosR, String txtfDocumentoIdentidadR,
			String txtfDireccionR, String txtfMuncipioR, String txtfCDR, String txtfEmailR, String txtfFaxR,
			String txtfMovilR, String txtfFijo) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `representante` ( `nombre`, `apellidos`, `documentoIdentidad`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `Email`) VALUES (?,?,?,?,?,?,?,?,?,?)";
		int last_inserted_id = -1;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, txtfNombreR);
			pstmt.setString(2, txtfApellidosR);
			pstmt.setString(3, txtfDocumentoIdentidadR);
			pstmt.setString(4, txtfDireccionR);
			pstmt.setString(5, txtfMuncipioR);
			pstmt.setString(6, txtfCDR);
			pstmt.setString(7, txtfFijo);
			pstmt.setString(8, txtfMovilR);
			pstmt.setString(9, txtfFaxR);
			pstmt.setString(10, txtfEmailR);
			r = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);

				System.out.println(last_inserted_id);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return last_inserted_id;

	}

	
	
	
	
	
	
	
	public int insertarPersona(String txtfNombreI, String txtfApellidosI, String txtfMunicipio, String txtfDireccionI,
			String txtfCDI, String txtfEmailI, String txtfFaxI, String txtfMovilI, String txtfFijoI, String CP) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `interesado` ( `nombre`, `apellidos`, `cif`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `email`) VALUES ( ?,?,?,?,?, ?,?, ?,?,?)";
		int last_inserted_id = -1;

		System.out.println("PUTO OSCAR" + r);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, txtfNombreI);
			pstmt.setString(2, txtfApellidosI);
			pstmt.setString(3, txtfCDI);
			pstmt.setString(4, txtfDireccionI);
			pstmt.setString(5, txtfMunicipio);
			pstmt.setString(6, CP);
			pstmt.setString(7, txtfFijoI);
			pstmt.setString(8, txtfMovilI);
			pstmt.setString(9, txtfFaxI);
			pstmt.setString(10, txtfEmailI);
			r = pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);

				System.out.println(last_inserted_id);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return last_inserted_id;

	}
	
	

	public int insertarActividad(Boolean getchckJustificantePago, Boolean getchckFotocopiaEscritura,
			Boolean getchckFotocopiaModelo36, Boolean getchckPlanos, Boolean getchckCD, Boolean getchckMemoria,
			Boolean getchckFotografia, Boolean getchckbxFotocopiaDNI, Boolean getchckbxCertificado1,
			Boolean getchckbxCertificado2, Boolean getchckCertificadoColegio, String comboBoxTipoSuelo,
			String dcFechaSolicitud, String dcFechaInicio, String txtfLocal, String txtfTipo, String txtfCuota,
			String txtfReferenciaCatastral, String txtfEmplazamiento, String gettxtfDescripcion,
			Boolean getchckFotocopiaLicenciaObra, Boolean chckOtrasAuto, String jComboBox) {

		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `actividad` (`fotoLicenciaObra`, `fotoOtrasAutorizaciones`, `fotoJustificantePago`, `fotoEscritura`, `fotoModelo036`, `fotoPlanos`, `fotoCD`, `fotoMemoria`, `fotoFotografia`, `tipoSuelo`, `referenciaCatastral`, `local`,"
				+ " `tipo`, `emplazamiento`, `fechaInicio`, `fechaSolicitud`, `cuota`, `descripcion`, `certColegioOficial`, `certModelo1`, `certModelo2`, `FotocopiaDNI`,Estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		PreparedStatement pstmt;
		int last_inserted_id = -1;

		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setBoolean(1, getchckFotocopiaLicenciaObra);
			pstmt.setBoolean(2, chckOtrasAuto);
			pstmt.setBoolean(3, getchckJustificantePago);
			pstmt.setBoolean(4, getchckFotocopiaEscritura);
			pstmt.setBoolean(5, getchckFotocopiaModelo36);
			pstmt.setBoolean(6, getchckPlanos);
			pstmt.setBoolean(7, getchckCD);
			pstmt.setBoolean(8, getchckMemoria);
			pstmt.setBoolean(9, getchckFotografia);
			pstmt.setString(10, comboBoxTipoSuelo);
			pstmt.setString(11, txtfReferenciaCatastral);
			pstmt.setString(12, txtfLocal);
			pstmt.setString(13, txtfTipo);
			pstmt.setString(14, txtfEmplazamiento);
			pstmt.setString(15, dcFechaInicio);
			pstmt.setString(16, dcFechaSolicitud);
			pstmt.setString(17, txtfCuota);
			pstmt.setString(18, gettxtfDescripcion);
			pstmt.setBoolean(19, getchckCertificadoColegio);
			pstmt.setBoolean(20, getchckbxCertificado1);
			pstmt.setBoolean(21, getchckbxCertificado2);
			pstmt.setBoolean(22, getchckbxFotocopiaDNI);
			pstmt.setString(23, jComboBox);

			r = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
				System.out.println(r);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return last_inserted_id;


	}


	
	
	public void insertarTablaInter(int idPersona, int idActividad) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `relactper` ( `idInt`, `idAct`) VALUES ( ?,? );";
		PreparedStatement pstmt;
		int last_inserted_id = -1;

		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, idPersona);
			pstmt.setInt(2, idActividad);

			r = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
				System.out.println(r);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}


	
	public void insertarTablaInter2(int idPer, int idRep) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `relintrep` (`id`, `idInteresado`, `idRepresentante`) VALUES (NULL, ?, ?)";
		PreparedStatement pstmt;
		int last_inserted_id = -1;

		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, idPer);
			pstmt.setInt(2, idRep);

			r = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
				System.out.println(r);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
	
	
	///////////////////////////////////////////////////////////////
	//---------------------UPDATES----------------------------///
	///////////////////////////////////////////////////////////////
	
	
	
public String repId;
public String repNombre="";
public String repApellidos="";
public String repDocumentoIdentidad="";
public String repDireccion="";
public String repMunicipio="";
public String repCP="";
public String repTlfF="";
public String repTlfM="";
public String repFax="";
public String repEmail="";
public String relIntRepId="";
public String relIntRepIdInteresado="";
public String relIntRepIdRepresentante="";
public String relactper;	
public String datoRegistro;
public String intId;
public String intNombre;
public String intApellido;
public String intCif;
public String intDireccion;
public String intMunicipio;
public String intCP;
public String intTlfF;
public String intTlfM;
public String intFax;
public String intEmail;
public String relActPerId;
public String relActPeIdInt;
public String relActPeIdAct;
public String ActId;
public String ActFotoLicenciaObra;
public String ActFotoOtrasAutorizaciones;
public String ActFotoJustificantePago;
public String ActFotoEscritura;
public String ActTipoSuelo;
public String ActReferenciaCatastral;
public String ActLocal;
public String ActTipo;
public String ActEmplazamiento;
public String ActFechaInicio;
public String ActFechaSolicitud;
public String ActCuota;
public String ActDescripcion;
public String ActCertColegioOficial;
public String ActCertModelo1;
public String ActCertModelo2;
public String ActFotocopiaDni;
public String ActFotoModelo036;
public String ActFotoPlanos;
public String ActFotoCD;
public String ActFotoMemoria;
public String ActFotoFofografia;
public String ActEstado;


//public String CambioTituId;
//public String CambioTituIdLicenciaAnterior;
//public String CambioTituNumExpediente;
//public String CambioTituEscrituraPropiedad;
//public String CambioTituContratoArrendamiento;
//public String CambioTituDocumentacionJust;
//public String CambioTituPlanosYPlantas;
//public String CambioTituFotoLicenciaAnterior;







	public void recogerDatosParaCambioTitularidad(String dato) {
		this.datoRegistro = dato;

		try {
			if (conexion == null) {
				System.out.println("NO EXISTE");
				System.exit(-1);
			}
			PreparedStatement pstmt;

			pstmt = conexion.prepareStatement(
					
					"SELECT * FROM actividad join relactper on actividad.id = relactper.idAct JOIN interesado on relactper.idInt = interesado.id left join relintrep on interesado.id = relintrep.idInteresado left  join representante on relintrep.idRepresentante = representante.id WHERE actividad.id= ? ");
			
			pstmt.setString(1, datoRegistro);
			ResultSet rset = pstmt.executeQuery();

			// ResultSetMetaData rsmd = rset.getMetaData();
			System.out.println("avanzo");
			int z = 0;
			while (rset.next()) {
//				intnombre = rset.getString("NOMBRE");

				repId= rset.getString("representante.id");
repNombre= rset.getString("representante.nombre");
repApellidos= rset.getString("representante.apellidos");
 repDocumentoIdentidad= rset.getString("representante.documentoIdentidad");
repDireccion= rset.getString("representante.direccion");
repMunicipio= rset.getString("representante.municipio");
repCP= rset.getString("representante.codigoPostal");
repTlfF= rset.getString("representante.telefonoFijo");
 repTlfM= rset.getString("representante.telefonoMovil");
repFax= rset.getString("representante.fax");
 repEmail= rset.getString("representante.Email");
relIntRepId= rset.getString("relintrep.id");
relIntRepIdInteresado= rset.getString("relintrep.idInteresado");
relIntRepIdRepresentante= rset.getString("relintrep.idRepresentante");	
intId= rset.getString("interesado.id");
intNombre= rset.getString("interesado.nombre");
intApellido= rset.getString("interesado.apellidos");
intCif= rset.getString("interesado.cif");
intDireccion= rset.getString("interesado.direccion");
intMunicipio= rset.getString("interesado.municipio");
intCP= rset.getString("interesado.codigoPostal");
intTlfF= rset.getString("interesado.telefonoFijo");
intTlfM= rset.getString("interesado.telefonoMovil");
intFax= rset.getString("interesado.fax");
intEmail= rset.getString("interesado.email");
relActPerId= rset.getString("relactper.id");
relActPeIdInt= rset.getString("relactper.idInt");
relActPeIdAct= rset.getString("relactper.idAct");
ActId= rset.getString("actividad.id");
ActFotoLicenciaObra= rset.getString("actividad.fotoLicenciaObra");
ActFotoOtrasAutorizaciones= rset.getString("actividad.fotoOtrasAutorizaciones");
 ActFotoJustificantePago= rset.getString("actividad.fotoJustificantePago");
ActFotoEscritura= rset.getString("actividad.fotoEscritura");
ActFotoModelo036= rset.getString("actividad.fotoModelo036");
ActFotoPlanos= rset.getString("actividad.fotoPlanos");
ActFotoCD= rset.getString("actividad.fotoCD");
ActFotoMemoria= rset.getString("actividad.fotoMemoria");
ActFotoFofografia= rset.getString("actividad.fotoFotografia");
 ActTipoSuelo= rset.getString("actividad.tipoSuelo");
ActReferenciaCatastral= rset.getString("actividad.referenciaCatastral");
ActLocal= rset.getString("actividad.local");
ActTipo= rset.getString("actividad.tipo");
 ActEmplazamiento= rset.getString("actividad.emplazamiento");
ActFechaInicio= rset.getString("actividad.fechaInicio");
ActFechaSolicitud= rset.getString("actividad.fechaSolicitud");
ActCuota= rset.getString("actividad.cuota");
ActDescripcion= rset.getString("actividad.descripcion");
ActCertColegioOficial= rset.getString("actividad.certColegioOficial");
 ActCertModelo1= rset.getString("actividad.certModelo1");
ActCertModelo2= rset.getString("actividad.certModelo2");
ActFotocopiaDni= rset.getString("actividad.FotocopiaDNI");
ActEstado = rset.getString("actividad.Estado");
				z += 1;
			}

		} catch (SQLException s) {
			s.printStackTrace();
		}
		vista2.devolverDatosTitular();
	}


	public String getRepId() {
		return repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}

	public String getRepNombre() {
		return repNombre;
	}

	public void setRepNombre(String repNombre) {
		this.repNombre = repNombre;
	}

	public String getRepApellidos() {
		return repApellidos;
	}

	public void setRepApellidos(String repApellidos) {
		this.repApellidos = repApellidos;
	}

	public String getRepDocumentoIdentidad() {
		return repDocumentoIdentidad;
	}

	public void setRepDocumentoIdentidad(String repDocumentoIdentidad) {
		this.repDocumentoIdentidad = repDocumentoIdentidad;
	}

	public String getRepDireccion() {
		return repDireccion;
	}

	public void setRepDireccion(String repDireccion) {
		this.repDireccion = repDireccion;
	}

	public String getRepMunicipio() {
		return repMunicipio;
	}

	public void setRepMunicipio(String repMunicipio) {
		this.repMunicipio = repMunicipio;
	}

	public String getRepCP() {
		return repCP;
	}

	public void setRepCP(String repCP) {
		this.repCP = repCP;
	}

	public String getRepTlfF() {
		return repTlfF;
	}

	public void setRepTlfF(String repTlfF) {
		this.repTlfF = repTlfF;
	}

	public String getRepTlfM() {
		return repTlfM;
	}

	public void setRepTlfM(String repTlfM) {
		this.repTlfM = repTlfM;
	}

	public String getRepFax() {
		return repFax;
	}

	public void setRepFax(String repFax) {
		this.repFax = repFax;
	}

	public String getRepEmail() {
		return repEmail;
	}

	public void setRepEmail(String repEmail) {
		this.repEmail = repEmail;
	}

	public String getRelIntRepId() {
		return relIntRepId;
	}

	public void setRelIntRepId(String relIntRepId) {
		this.relIntRepId = relIntRepId;
	}

	public String getRelIntRepIdInteresado() {
		return relIntRepIdInteresado;
	}

	public void setRelIntRepIdInteresado(String relIntRepIdInteresado) {
		this.relIntRepIdInteresado = relIntRepIdInteresado;
	}

	public String getRelIntRepIdRepresentante() {
		return relIntRepIdRepresentante;
	}

	public void setRelIntRepIdRepresentante(String relIntRepIdRepresentante) {
		this.relIntRepIdRepresentante = relIntRepIdRepresentante;
	}

	public String getRelactper() {
		return relactper;
	}

	public void setRelactper(String relactper) {
		this.relactper = relactper;
	}

	public String getIntId() {
		return intId;
	}

	public void setIntId(String intId) {
		this.intId = intId;
	}

	public String getIntNombre() {
		return intNombre;
	}

	public void setIntNombre(String intNombre) {
		this.intNombre = intNombre;
	}

	public String getIntApellido() {
		return intApellido;
	}

	public void setIntApellido(String intApellido) {
		this.intApellido = intApellido;
	}

	public String getIntCif() {
		return intCif;
	}

	public void setIntCif(String intCif) {
		this.intCif = intCif;
	}

	public String getIntDireccion() {
		return intDireccion;
	}

	public void setIntDireccion(String intDireccion) {
		this.intDireccion = intDireccion;
	}

	public String getIntMunicipio() {
		return intMunicipio;
	}

	public void setIntMunicipio(String intMunicipio) {
		this.intMunicipio = intMunicipio;
	}

	public String getIntCP() {
		return intCP;
	}

	public void setIntCP(String intCP) {
		this.intCP = intCP;
	}

	public String getIntTlfF() {
		return intTlfF;
	}

	public void setIntTlfF(String intTlfF) {
		this.intTlfF = intTlfF;
	}

	public String getIntTlfM() {
		return intTlfM;
	}

	public void setIntTlfM(String intTlfM) {
		this.intTlfM = intTlfM;
	}

	public String getIntFax() {
		return intFax;
	}

	public void setIntFax(String intFax) {
		this.intFax = intFax;
	}

	public String getIntEmail() {
		return intEmail;
	}

	public void setIntEmail(String intEmail) {
		this.intEmail = intEmail;
	}

	public String getRelActPerId() {
		return relActPerId;
	}

	public void setRelActPerId(String relActPerId) {
		this.relActPerId = relActPerId;
	}

	public String getRelActPeIdInt() {
		return relActPeIdInt;
	}

	public void setRelActPeIdInt(String relActPeIdInt) {
		this.relActPeIdInt = relActPeIdInt;
	}

	public String getRelActPeIdAct() {
		return relActPeIdAct;
	}

	public void setRelActPeIdAct(String relActPeIdAct) {
		this.relActPeIdAct = relActPeIdAct;
	}

	public String getActId() {
		return ActId;
	}

	public void setActId(String actId) {
		ActId = actId;
	}

	public String getActFotoLicenciaObra() {
		return ActFotoLicenciaObra;
	}

	public void setActFotoLicenciaObra(String actFotoLicenciaObra) {
		ActFotoLicenciaObra = actFotoLicenciaObra;
	}

	public String getActFotoOtrasAutorizaciones() {
		return ActFotoOtrasAutorizaciones;
	}

	public void setActFotoOtrasAutorizaciones(String actFotoOtrasAutorizaciones) {
		ActFotoOtrasAutorizaciones = actFotoOtrasAutorizaciones;
	}

	public String getActFotoJustificantePago() {
		return ActFotoJustificantePago;
	}

	public void setActFotoJustificantePago(String actFotoJustificantePago) {
		ActFotoJustificantePago = actFotoJustificantePago;
	}

	public String getActFotoEscritura() {
		return ActFotoEscritura;
	}

	public void setActFotoEscritura(String actFotoEscritura) {
		ActFotoEscritura = actFotoEscritura;
	}

	public String getActTipoSuelo() {
		return ActTipoSuelo;
	}

	public void setActTipoSuelo(String actTipoSuelo) {
		ActTipoSuelo = actTipoSuelo;
	}
	public String getActEstado() {
		return ActEstado;
	}

	public void setActEstado(String actEstado) {
		ActEstado = actEstado;
	}


	public String getActReferenciaCatastral() {
		return ActReferenciaCatastral;
	}

	public void setActReferenciaCatastral(String actReferenciaCatastral) {
		ActReferenciaCatastral = actReferenciaCatastral;
	}

	public String getActTipo() {
		return ActTipo;
	}

	public void setActTipo(String actTipo) {
		ActTipo = actTipo;
	}

	public String getActEmplazamiento() {
		return ActEmplazamiento;
	}

	public void setActEmplazamiento(String actEmplazamiento) {
		ActEmplazamiento = actEmplazamiento;
	}

	public String getActFechaInicio() {
		return ActFechaInicio;
	}

	public void setActFechaInicio(String actFechaInicio) {
		ActFechaInicio = actFechaInicio;
	}

	public String getActFechaSolicitud() {
		return ActFechaSolicitud;
	}

	public void setActFechaSolicitud(String actFechaSolicitud) {
		ActFechaSolicitud = actFechaSolicitud;
	}

	public String getActCuota() {
		return ActCuota;
	}

	public void setActCuota(String actCuota) {
		ActCuota = actCuota;
	}

	public String getActDescripcion() {
		return ActDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		ActDescripcion = actDescripcion;
	}

	public String getActCertColegioOficial() {
		return ActCertColegioOficial;
	}

	public void setActCertColegioOficial(String actCertColegioOficial) {
		ActCertColegioOficial = actCertColegioOficial;
	}

	public String getActCertModelo1() {
		return ActCertModelo1;
	}

	public void setActCertModelo1(String actCertModelo1) {
		ActCertModelo1 = actCertModelo1;
	}

	public String getActCertModelo2() {
		return ActCertModelo2;
	}

	public void setActCertModelo2(String actCertModelo2) {
		ActCertModelo2 = actCertModelo2;
	}

	public String getActFotocopiaDni() {
		return ActFotocopiaDni;
	}

	public void setActFotocopiaDni(String actFotocopiaDni) {
		ActFotocopiaDni = actFotocopiaDni;
	}

	public String getActFotoModelo036() {
		return ActFotoModelo036;
	}

	public void setActFotoModelo036(String actFotoModelo036) {
		ActFotoModelo036 = actFotoModelo036;
	}

	public String getActFotoPlanos() {
		return ActFotoPlanos;
	}

	public void setActFotoPlanos(String actFotoPlanos) {
		ActFotoPlanos = actFotoPlanos;
	}

	public String getActFotoCD() {
		return ActFotoCD;
	}

	public void setActFotoCD(String actFotoCD) {
		ActFotoCD = actFotoCD;
	}

	public String getActFotoMemoria() {
		return ActFotoMemoria;
	}

	public void setActFotoMemoria(String actFotoMemoria) {
		ActFotoMemoria = actFotoMemoria;
	}

	public String getActFotoFofografia() {
		return ActFotoFofografia;
	}

	public void setActFotoFofografia(String actFotoFofografia) {
		ActFotoFofografia = actFotoFofografia;
	}
	
	public void habilitarRepresentante() {
		vista2.habilitarRepresentante();
	}


	public void deshabilitarRepresentante() {
		vista2.deshabilitarRepresentante();
		
	}

	public void realizarUpdate(String comboBoxActTipoSuelo, String txtfActReferenciaCatastral, String txtfActLocal,
			String txtfActTipo, String txtfActEmplazamiento, String txtfDCFechaInicio, String txtfDCFechaSolicitud,
			String txtActCuota, Boolean checkActFotoJustificantePago, Boolean checkActFotoEscritura,
			Boolean checkActFotoModelo036, Boolean checkActFotoPlanos, Boolean checkActFotoCD,
			Boolean checkActFotoMemoria, Boolean checkActFotoFofografia, Boolean checkActFotocopiaDni,
			Boolean checkActCertColegioOficial, Boolean checkActCertModelo1, Boolean checkActCertModelo2,
			Boolean checkActFotoLicenciaObra, Boolean checkActFotoOtrasAutorizaciones, String txtPActDescripcion,
			String txtfintNombre, String txtfintApellido, String txtfintCif, String txtfintDireccion,
			String txtfintMunicipio, String txtfintCP, String txtfintTlfF, String txtfintTlfM, String txtfintFax,
			String txtfintEmail, String jComboBoxEstado) {
		

		Connection con = getConnection();
		int r = 0;
		String query = "UPDATE interesado SET nombre = ?, apellidos = ?, cif = ?, direccion = ?, municipio = ?, codigoPostal = ?, telefonoFijo = ?, telefonoMovil = ?, fax = ?, email = ? where id = ?";
		
		
		PreparedStatement pstmt;
		int last_inserted_id = -1;

		try {
			pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, txtfintNombre);
			pstmt.setString(2, txtfintApellido);
			pstmt.setString(3, txtfintCif);
			pstmt.setString(4, txtfintDireccion);
			pstmt.setString(5, txtfintMunicipio);
			pstmt.setString(6, txtfintCP);
			pstmt.setString(7, txtfintTlfF);
			pstmt.setString(8, txtfintTlfM);
			pstmt.setString(9, txtfintFax);
			pstmt.setString(10, txtfintEmail);
			pstmt.setString(11, intId);
			
			r = pstmt.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();

		}
		String query2 = "UPDATE actividad SET fotoLicenciaObra= ?,fotoOtrasAutorizaciones= ?,fotoJustificantePago= ?,fotoEscritura= ?,fotomodelo036= ?,fotoPlanos= ?,fotoCD= ?,fotoMemoria= ?,fotoFotografia= ?,tipoSuelo= ?,referenciaCatastral=?,local=?,tipo=?,emplazamiento=?,fechaSolicitud=?,fechainicio=?,cuota=?,descripcion=?,certColegioOficial=?,certModelo1=?,certModelo2 = ?, FotocopiaDNI = ?, Estado = ? where id = ?";
		try {
			pstmt = con.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);
			pstmt.setBoolean(1, checkActFotoLicenciaObra);
			pstmt.setBoolean(2, checkActFotoOtrasAutorizaciones);
			pstmt.setBoolean(3, checkActFotoJustificantePago);
			pstmt.setBoolean(4, checkActFotoEscritura);
			pstmt.setBoolean(5, checkActFotoModelo036);
			pstmt.setBoolean(6, checkActFotoPlanos);
			pstmt.setBoolean(7, checkActFotoCD);
			pstmt.setBoolean(8, checkActFotoMemoria);
			pstmt.setBoolean(9, checkActFotoFofografia);
			pstmt.setString(10, comboBoxActTipoSuelo);
			pstmt.setString(11, txtfActReferenciaCatastral);
			pstmt.setString(12, txtfActLocal);
			pstmt.setString(13, txtfActTipo);
			pstmt.setString(14, txtfActEmplazamiento);
			pstmt.setString(15, txtfDCFechaSolicitud);
			pstmt.setString(16, txtfDCFechaInicio);
			pstmt.setString(17, txtActCuota);
			pstmt.setString(18, txtPActDescripcion);
			pstmt.setBoolean(19, checkActCertColegioOficial);
			pstmt.setBoolean(20, checkActCertModelo1);
			pstmt.setBoolean(21, checkActCertModelo2);
			pstmt.setBoolean(22, checkActFotocopiaDni);
			pstmt.setString(23, jComboBoxEstado);
			pstmt.setString(24, ActId);
			


			r = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
				System.out.println(r);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
	}

	public void realizarUpdate2(String txtfrepNombre, String txtfrepApellidos, String txtfrepDocumentoIdentidad,
			String txtfrepDireccion, String txtfrepMunicipio, String txtfrepCP, String txtfrepTlfF, String txtfrepTlfM,
			String txtfrepFax, String txtfrepEmail) {
		Connection con = getConnection();
		int r = 0;
		if(!repId.equals(null)){
			String query3 = "UPDATE representante SET nombre=?,apellidos=?,documentoIdentidad=?,direccion=?,municipio=?,codigoPostal=?,telefonoFijo=?,telefonoMovil=?,fax=?,Email=?where id = ?";
			PreparedStatement pstmt;
			int last_inserted_id = -1;
			
			try {
				pstmt = con.prepareStatement(query3, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, txtfrepNombre);
				pstmt.setString(2, txtfrepApellidos);
				pstmt.setString(3, txtfrepDocumentoIdentidad);
				pstmt.setString(4, txtfrepDireccion);
				pstmt.setString(5, txtfrepMunicipio);
				pstmt.setString(6, txtfrepCP);
				pstmt.setString(7, txtfrepTlfF);
				pstmt.setString(8, txtfrepTlfM);
				pstmt.setString(9, txtfrepFax);	
				pstmt.setString(10, txtfrepEmail);
				pstmt.setString(11, repId);

				r = pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					last_inserted_id = rs.getInt(1);
					System.out.println(r);

				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}


}
