package Codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

public class ModeloBBDD implements Modelo {

	private VistaWB vista;
	private Properties datos;
	private File miFichero;
	private InputStream entrada;
	private final String FILE = "Fichero.ini";
	private Connection conexion;
	private Statement stmt;
	public String tabla[][] = null;
	public String tabla2[][] = null;
	private String bd, login, pwd;




	public void Conexion(String bd,String login,String pwd) {
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
               // TODO: handle exception
        }
  }
	public void Consulta(String Query) {
		vista.clear_Table();
		String query = Query;

		try {
			PreparedStatement stmt;
			stmt =conexion.prepareStatement(query);

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
				fila[1] = rset.getString("nombre");
				fila[2] = rset.getString("apellidos");
				fila[3] = rset.getString("tipo");
				fila[4] = rset.getString("cif");
				fila[5] = rset.getString("referenciaCatastral");
				fila[6] = rset.getString("local");
				fila[7] = rset.getString("tipoSuelo");
				fila[8] = rset.getString("emplazamiento");
				fila[9] = rset.getString("fechaInicio");
				fila[10] = rset.getString("fechaSolicitud");
				fila[11] = rset.getString("cuota");
				fila[12] = rset.getString("fotoJustificantePago");
				fila[13] = rset.getString("fotoEscritura");
				fila[15] = rset.getString("fotoModelo036");
				fila[16] = rset.getString("fotoPlanos");
				fila[17] = rset.getString("fotoCD");
				fila[18] = rset.getString("fotoMemoria");
				fila[19] = rset.getString("fotoFotografia");
				fila[20] = rset.getString("FotocopiaDNI");
				fila[21] = rset.getString("certColegioOficial");
				fila[22] = rset.getString("certModelo1");
				fila[23] = rset.getString("certModelo2");
				fila[24] = rset.getString("fotoLicenciaObra");
				fila[25] = rset.getString("fotoOtrasAutorizaciones");
				fila[26] = rset.getString("descripcion");
				fila[27] = rset.getString("interesado.nombre");
				fila[28] = rset.getString("interesado.apellidos");
				fila[29] = rset.getString("interesado.cif");
				fila[30] = rset.getString("interesado.direccion");
				fila[31] = rset.getString("interesado.municipio");
				fila[32] = rset.getString("interesado.codigoPostal");
				fila[33] = rset.getString("interesado.telefonoMovil");
				fila[34] = rset.getString("interesado.telefonoFijo");
				fila[35] = rset.getString("interesado.fax");
				fila[36] = rset.getString("interesado.email");

				tabla[cont2] = fila;

				cont2++;

			}
			// vista.RellenarTabla(tabla);
			vista.setDatosTabla();
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	public void Consulta2(String DNI, String razonSocial) {
		vista.clear_Table();
		String query = "";

		try {
			if (DNI == null || DNI.equals("")) {
				query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where interesado.nombre = ?";
			} else if (razonSocial == null || razonSocial.equals("")) {
				query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id  where interesado.cifDniNie = ?";

			} else {
				query = "SELECT * FROM actividad JOIN interesado on actividad.idInteresado = interesado.id where interesado.cifDniNie = ? AND interesado.nombre like ?";
			}
			PreparedStatement pstmt = conexion.prepareStatement(query);

			if (DNI == null || DNI.equals("")) {
				pstmt.setString(1, razonSocial);
			} else if (razonSocial == null || razonSocial.equals("")) {
				pstmt.setString(1, DNI);
			} else {
				pstmt.setString(1, DNI);
				pstmt.setString(2, razonSocial);
			}
			int cont = 0;

			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			while (rset.next()) {
				cont += 1;
				System.out.println(rset);
			}
			rset = pstmt.executeQuery();

			int cont2 = 0;
			tabla = new String[cont][rsmd.getColumnCount()];
			// System.out.println("-----------------------");
			// System.out.println(rsmd.getColumnCount());

			while (rset.next()) {
				String fila[] = new String[rsmd.getColumnCount()];
				fila[0] = rset.getString("id");
				fila[1] = rset.getString("nombre");
				fila[2] = rset.getString("apellidos");
				fila[3] = rset.getString("tipo");
				fila[4] = rset.getString("cif");
				fila[5] = rset.getString("referenciaCatastral");
				fila[6] = rset.getString("local");
				fila[7] = rset.getString("tipoSuelo");
				fila[8] = rset.getString("emplazamiento");
				fila[9] = rset.getString("fechaInicio");
				fila[10] = rset.getString("fechaSolicitud");
				fila[11] = rset.getString("cuota");
				fila[12] = rset.getString("fotoJustificantePago");
				fila[13] = rset.getString("fotoEscritura");
				fila[15] = rset.getString("fotoModelo036");
				fila[16] = rset.getString("fotoPlanos");
				fila[17] = rset.getString("fotoCD");
				fila[18] = rset.getString("fotoMemoria");
				fila[19] = rset.getString("fotoFotografia");
				fila[20] = rset.getString("FotocopiaDNI");
				fila[21] = rset.getString("certColegioOficial");
				fila[22] = rset.getString("certModelo1");
				fila[23] = rset.getString("certModelo2");
				fila[24] = rset.getString("fotoLicenciaObra");
				fila[25] = rset.getString("fotoOtrasAutorizaciones");
				fila[26] = rset.getString("descripcion");
				fila[27] = rset.getString("interesado.nombre");
				fila[28] = rset.getString("interesado.apellidos");
				fila[29] = rset.getString("interesado.cif");
				fila[30] = rset.getString("interesado.direccion");
				fila[31] = rset.getString("interesado.municipio");
				fila[32] = rset.getString("interesado.codigoPostal");
				fila[33] = rset.getString("interesado.telefonoMovil");
				fila[34] = rset.getString("interesado.telefonoFijo");
				fila[35] = rset.getString("interesado.fax");
				fila[36] = rset.getString("interesado.email");

				tabla[cont2] = fila;

				cont2++;

			}
			// vista.RellenarTabla(tabla);
			vista.setDatosTabla();
			rset.close();
			pstmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	public void Consulta3(String tipo, String fechaInicial, String fechaFinal) {
		vista.clear_Table();
		String query = "";
		if ((tipo == null || tipo.equals("")) && !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))&& !(fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy"))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.fechaInicio = ? AND actividad.fechaSolicitud = ?";
		} else if ((fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy")) && !(tipo == null || tipo.equals(""))&& !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.tipo = ? AND actividad.fechaSolicitud = ?";

		} else if ((fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy")) && !(tipo == null || tipo.equals("")) && !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.tipo = ? AND actividad.fechaInicio = ?";
		} else if ((tipo == null || tipo.equals("")) && (fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.fechaSolicitud = ?";
		} else if ((fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy")) && (tipo == null || tipo.equals(""))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.fechaInicio = ?";

		} else if ((fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))	&& (fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy"))) {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.tipo = ?";

		} else {
			query = "SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id where actividad.fechaInicio = ? AND actividad.fechaSolicitud = ? AND actividad.tipo=?";
		}

		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);

			int cont = 0;

			if ((tipo == null || tipo.equals("")) && !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))&& !(fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy"))) {
				pstmt.setString(1, fechaInicial);
				pstmt.setString(2, fechaFinal);
			} else if ((fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy")) && !(tipo == null || tipo.equals(""))&& !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {
				pstmt.setString(1, tipo);
				pstmt.setString(2, fechaFinal);

			} else if ((fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy")) && !(tipo == null || tipo.equals("")) && !(fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {
				pstmt.setString(1, tipo);
				pstmt.setString(2, fechaInicial);
			} else if ((tipo == null || tipo.equals(""))&& (fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))) {

				pstmt.setString(1, fechaFinal);
			} else if ((fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy")) && (tipo == null || tipo.equals(""))) {
				pstmt.setString(1, fechaInicial);

			} else if ((fechaInicial == null || fechaInicial.equals("dd-MMM-yyyy"))
					&& (fechaFinal == null || fechaFinal.equals("dd-MMM-yyyy"))) {
				pstmt.setString(1, tipo);

			} else {
				pstmt.setString(1, fechaInicial);
				pstmt.setString(2, fechaFinal);
				pstmt.setString(3, tipo);
			}

			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			while (rset.next()) {
				cont += 1;
				System.out.println(rset);
			}
			rset = pstmt.executeQuery();

			int cont2 = 0;
			tabla = new String[cont][rsmd.getColumnCount()];
			// System.out.println("-----------------------");
			// System.out.println(rsmd.getColumnCount());

			while (rset.next()) {
				String fila[] = new String[rsmd.getColumnCount()];
				fila[0] = rset.getString("id");
				fila[1] = rset.getString("nombre");
				fila[2] = rset.getString("apellidos");
				fila[3] = rset.getString("tipo");
				fila[4] = rset.getString("cif");
				fila[5] = rset.getString("referenciaCatastral");
				fila[6] = rset.getString("local");
				fila[7] = rset.getString("tipoSuelo");
				fila[8] = rset.getString("emplazamiento");
				fila[9] = rset.getString("fechaInicio");
				fila[10] = rset.getString("fechaSolicitud");
				fila[11] = rset.getString("cuota");
				fila[12] = rset.getString("fotoJustificantePago");
				fila[13] = rset.getString("fotoEscritura");
				fila[15] = rset.getString("fotoModelo036");
				fila[16] = rset.getString("fotoPlanos");
				fila[17] = rset.getString("fotoCD");
				fila[18] = rset.getString("fotoMemoria");
				fila[19] = rset.getString("fotoFotografia");
				fila[20] = rset.getString("FotocopiaDNI");
				fila[21] = rset.getString("certColegioOficial");
				fila[22] = rset.getString("certModelo1");
				fila[23] = rset.getString("certModelo2");
				fila[24] = rset.getString("fotoLicenciaObra");
				fila[25] = rset.getString("fotoOtrasAutorizaciones");
				fila[26] = rset.getString("descripcion");
				fila[27] = rset.getString("interesado.nombre");
				fila[28] = rset.getString("interesado.apellidos");
				fila[29] = rset.getString("interesado.cif");
				fila[30] = rset.getString("interesado.direccion");
				fila[31] = rset.getString("interesado.municipio");
				fila[32] = rset.getString("interesado.codigoPostal");
				fila[33] = rset.getString("interesado.telefonoMovil");
				fila[34] = rset.getString("interesado.telefonoFijo");
				fila[35] = rset.getString("interesado.fax");
				fila[36] = rset.getString("interesado.email");

				tabla[cont2] = fila;

				cont2++;

			}
			// vista.RellenarTabla(tabla);
			vista.setDatosTabla();
			rset.close();
			pstmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	public void refrescar() {

		this.Consulta("SELECT * FROM actividad join relactper on actividad.id = relactper.idAct JOIN interesado on relactper.idInt = interesado.id join relintrep on interesado.id = relintrep.idInteresado join representante on relintrep.idRepresentante = representante.id");
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
		return tabla2;
	}

	public void setTabla(String[][] tabla) {
		this.tabla = tabla;
	}

	@Override
	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}

	public int insertarRepresentante(String txtfNombreR, String txtfApellidosR, String txtfDocumentoIdentidadR,
			String txtfDireccionR, String txtfMuncipioR, String txtfCDR, String txtfEmailR, String txtfFaxR,
			String txtfMovilR, String txtfFijo) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `representante` ( `nombre`, `apellidos`, `documentoIdentidad`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `Email`) VALUES (?,?,?,?,?,?,?,?,?,?)";
		int last_inserted_id =-1;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, txtfNombreR);
			pstmt.setString(2, txtfApellidosR);
			pstmt.setString(3, txtfDocumentoIdentidadR);
			pstmt.setString(4, txtfDireccionR);
			pstmt.setString(5, txtfMuncipioR);
			pstmt.setString(6, txtfCDR);
			pstmt.setString(7, txtfFijo );
			pstmt.setString(8, txtfMovilR);
			pstmt.setString(9, txtfFaxR);
			pstmt.setString(10,txtfEmailR);
			r=pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next())
            {
                 last_inserted_id = rs.getInt(1);
                
                System.out.println(last_inserted_id);
                
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return last_inserted_id;
		
		
	}

	

	public int insertarPersona(String txtfNombreI, String txtfApellidosI, String txtfMunicipio, String txtfDireccionI,
			String txtfCDI, String txtfEmailI, String txtfFaxI, String txtfMovilI, String txtfFijoI, String CP) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `interesado` ( `nombre`, `apellidos`, `cif`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `email`) VALUES ( ?,?,?,?,?, ?,?, ?,?,?)";
		int last_inserted_id=-1;
		
		  System.out.println("PUTO OSCAR"+r);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, txtfNombreI);
			pstmt.setString(2, txtfApellidosI);
			pstmt.setString(3, txtfCDI);
			pstmt.setString(4, txtfDireccionI);
			pstmt.setString(5, txtfMunicipio);
			pstmt.setString(6, CP);
			pstmt.setString(7, txtfFijoI );
			pstmt.setString(8, txtfMovilI);
			pstmt.setString(9, txtfFaxI);
			pstmt.setString(10,txtfEmailI);
			r=pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next())
            {
            	last_inserted_id = rs.getInt(1);
                
                System.out.println(last_inserted_id);
                
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return last_inserted_id;
		
	}

	public int insertarActividad(Boolean getchckJustificantePago, Boolean getchckFotocopiaEscritura,
			Boolean getchckFotocopiaModelo36, Boolean getchckPlanos, Boolean getchckCD, Boolean getchckMemoria,
			Boolean getchckFotografia, Boolean getchckbxFotocopiaDNI, Boolean getchckbxCertificado1,
			Boolean getchckbxCertificado2, Boolean getchckCertificadoColegio, String comboBoxTipoSuelo,
			String dcFechaSolicitud, String dcFechaInicio, String txtfLocal, String txtfTipo, String txtfCuota,
			String txtfReferenciaCatastral, String txtfEmplazamiento, String gettxtfDescripcion, Boolean getchckFotocopiaLicenciaObra, Boolean chckOtrasAuto) {
		
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `actividad` (`fotoLicenciaObra`, `fotoOtrasAutorizaciones`, `fotoJustificantePago`, `fotoEscritura`, `fotoModelo036`, `fotoPlanos`, `fotoCD`, `fotoMemoria`, `fotoFotografia`, `tipoSuelo`, `referenciaCatastral`, `local`,"
				+ " `tipo`, `emplazamiento`, `fechaInicio`, `fechaSolicitud`, `cuota`, `descripcion`, `certColegioOficial`, `certModelo1`, `certModelo2`, `FotocopiaDNI`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt;
		int last_inserted_id=-1;
		
		try {
			pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			pstmt.setBoolean(1, getchckFotocopiaLicenciaObra);
			pstmt.setBoolean(2, chckOtrasAuto);
			pstmt.setBoolean(3, getchckJustificantePago);
			pstmt.setBoolean(4, getchckFotocopiaEscritura);
			pstmt.setBoolean(5, getchckFotocopiaModelo36);
			pstmt.setBoolean(6, getchckPlanos);
			pstmt.setBoolean(7, getchckCD );
			pstmt.setBoolean(8, getchckMemoria);
			pstmt.setBoolean(9, getchckFotografia);
			pstmt.setString(10, comboBoxTipoSuelo);
			pstmt.setString(11,txtfReferenciaCatastral);
			pstmt.setString(12,txtfLocal);
			pstmt.setString(13,txtfTipo);
			pstmt.setString(14,txtfEmplazamiento);
			pstmt.setString(15,dcFechaInicio);
			pstmt.setString(16,dcFechaSolicitud);
			pstmt.setString(17,txtfCuota);
			pstmt.setString(18,gettxtfDescripcion);
			pstmt.setBoolean(19,getchckCertificadoColegio);
			pstmt.setBoolean(20,getchckbxCertificado1);
			pstmt.setBoolean(21,getchckbxCertificado2);
			pstmt.setBoolean(22,getchckbxFotocopiaDNI);
			
			r=pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			 if(rs.next())
	            {
	                last_inserted_id = rs.getInt(1);
	                System.out.println(r);
                
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(-1);
		}
		
		return last_inserted_id;
		// TODO Auto-generated method stub
		
	}
//INSERT INTO `relintrep` (`id`, `idInteresado`, `idRepresentante`) VALUES (NULL, '3', NULL);

	public void insertarTablaInter(int idPersona, int idActividad) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `relactper` ( `idInt`, `idAct`) VALUES ( ?,? );";
		PreparedStatement pstmt;
		int last_inserted_id=-1;
		
		try {
			pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, idPersona);
			pstmt.setInt(2, idActividad);
			
			r=pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			 if(rs.next())
	            {
	                last_inserted_id = rs.getInt(1);
	                System.out.println(r);
                
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(-1);
		}
	}


	public void insertarTablaInter2(int idPer, int idRep) {
		Connection con = getConnection();
		int r = 0;
		String query = "INSERT INTO `relintrep` (`id`, `idInteresado`, `idRepresentante`) VALUES (NULL, ?, ?)";
		PreparedStatement pstmt;
		int last_inserted_id=-1;
		
		try {
			pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, idPer);
			pstmt.setInt(2, idRep);
			
			r=pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			 if(rs.next())
	            {
	                last_inserted_id = rs.getInt(1);
	                System.out.println(r);
                
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(-1);
		}
		
	}
	

}
