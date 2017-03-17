
package ua.com.hotel.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileWriter {

	enum Folder{
		CITY, HOTELNAME, ROOMSERVICE
	}
	
	boolean write(Folder folder, MultipartFile file, Long id);
}