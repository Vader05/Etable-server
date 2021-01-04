package etable.domain.configuracion.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;


public class Image {

	private String imagen;
	private String name;
	
	public Image(String image, String name) {
		super();
		this.imagen = image;
		this.name = name;
	}
	public String getImage() {
		return imagen;
	}
	public void setImage(String image) {
		this.imagen = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String saveImage() throws IOException {
		if (this.name != null && this.imagen != null) {
			String path = "src/../../eTable-web/src/assets/logo-emp/";
			String pathName = "/assets/logo-emp/" + this.name;
			String imageByte = (imagen.substring(imagen.indexOf(",") + 1));
			File filePath = new File(path, this.name);
			try(FileOutputStream fos=new FileOutputStream(filePath.getPath())) {
		        fos.write(decodeImage(imageByte));
		        fos.flush();
		      }
		      catch (java.io.IOException e) {
		    	  pathName = "";
		      }
			return pathName;
		} else {
			return "";
		}
	}
	
	public  byte[] decodeImage(String imageByte) {
		return Base64.getDecoder().decode((imageByte).getBytes());
	}
}
