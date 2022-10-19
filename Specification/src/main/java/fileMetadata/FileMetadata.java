package fileMetadata;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FileMetadata {
	
	private String fileID;
	private String name;
	private String absolutePath;
	private FileMetadata parent;
	private Date timeCreated;
	private Date timeModified;
	private boolean isFile;
	private boolean isDirectory;
	private boolean isStorage;
	private boolean isDownloadFile;
	private boolean isDataRoot;
	private boolean isConfigJSONFile;
	private boolean isStrorageTreeStructureJSONFile;
	
	//if directory
	private Integer numOfFilesLimit;
	
	// if storage
	private Long storageSize;
	private Set<String> unsupportedFiles = new HashSet<>();
	
	
	public FileMetadata() {
		
	}
	
	public FileMetadata(FileMetadataBuilder builder) {
		this.fileID = builder.fileID;
		this.name = builder.name;
		this.timeCreated = builder.timeCreated;
		this.timeModified = builder.timeModified;
		this.absolutePath = builder.absolutePath;
		this.parent = builder.parent;
		this.isFile = builder.isFile;
		this.isDirectory = builder.isDirectory;
		this.isStorage = builder.isStorage;
		this.isDownloadFile = builder.isDownloadFile;
		this.isDataRoot = builder.isDataRoot;
		this.isConfigJSONFile = builder.isConfigJSONFile;
		this.isStrorageTreeStructureJSONFile = builder.isStrorageTreeStructureJSONFile;
		
		this.numOfFilesLimit = builder.numOfFilesLimit;
		
		this.storageSize = builder.storageSize;
		this.unsupportedFiles = builder.unsupportedFiles;
	}
	
	
	
	public String getFileID() {
		return fileID;
	}

	public void setFileID(String fileID) {
		this.fileID = fileID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}
	public Date getTimeModified() {
		return timeModified;
	}
	public void setTimeModified(Date timeModified) {
		this.timeModified = timeModified;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public FileMetadata getParent() {
		return parent;
	}

	public void setParent(FileMetadata parent) {
		this.parent = parent;
	}

	public boolean isFile() {
		return isFile;
	}

	public void setFile(boolean isFile) {
		this.isFile = isFile;
	}

	public boolean isDirectory() {
		return isDirectory;
	}

	public void setDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}

	public boolean isStorage() {
		return isStorage;
	}

	public void setStorage(boolean isStorage) {
		this.isStorage = isStorage;
	}
	
	public boolean isDownloadFile() {
		return isDownloadFile;
	}

	public void setDownloadFile(boolean isDownloadFile) {
		this.isDownloadFile = isDownloadFile;
	}

	public boolean isDataRoot() {
		return isDataRoot;
	}

	public void setDataRoot(boolean isDataRoot) {
		this.isDataRoot = isDataRoot;
	}

	public boolean isStrorageTreeStructureJSONFile() {
		return isStrorageTreeStructureJSONFile;
	}

	public void setStrorageTreeStructureJSONFile(boolean isStrorageTreeStructureJSONFile) {
		this.isStrorageTreeStructureJSONFile = isStrorageTreeStructureJSONFile;
	}

	public Integer getNumOfFilesLimit() {
		return numOfFilesLimit;
	}

	public void setNumOfFilesLimit(Integer numOfFilesLimit) {
		this.numOfFilesLimit = numOfFilesLimit;
	}

	public Long getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
	}

	public Set<String> getUnsupportedFiles() {
		return unsupportedFiles;
	}

	public void setUnsupportedFiles(Set<String> unsupportedFiles) {
		this.unsupportedFiles = unsupportedFiles;
	}

	public boolean isConfigJSONFile() {
		return isConfigJSONFile;
	}

	public boolean isConfigFile() {
		return isConfigJSONFile;
	}

	public void setConfigJSONFile(boolean isConfigJSONFile) {
		this.isConfigJSONFile = isConfigJSONFile;
	}
	
	public FileMetadata clone() {
		FileMetadata file = new FileMetadata();
		
		return file;
	}

	

	@Override
	public String toString() {
		final int maxLen = 22;
		return "FileMetadata [" + (fileID != null ? "fileID=" + fileID + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (absolutePath != null ? "absolutePath=" + absolutePath + ", " : "")
				+ (parent != null ? "parent=" + parent + ", " : "")
				+ (timeCreated != null ? "timeCreated=" + timeCreated + ", " : "")
				+ (timeModified != null ? "timeModified=" + timeModified + ", " : "") + "isFile=" + isFile
				+ ", isDirectory=" + isDirectory + ", isStorage=" + isStorage + ", isDataRoot=" + isDataRoot
				+ ", isConfigJSONFile=" + isConfigJSONFile + ", isStrorageTreeStructureJSONFile="
				+ isStrorageTreeStructureJSONFile + ", "
				+ (numOfFilesLimit != null ? "numOfFilesLimit=" + numOfFilesLimit + ", " : "")
				+ (storageSize != null ? "storageSize=" + storageSize + ", " : "")
				+ (unsupportedFiles != null ? "unsupportedFiles=" + toString(unsupportedFiles, maxLen) : "") + "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}



	// Builder
	public static class FileMetadataBuilder{
		
		private String fileID;
		private String name;
		private String absolutePath;
		private FileMetadata parent;
		private Date timeCreated;
		private Date timeModified;
		private boolean isFile;
		private boolean isDirectory;
		private boolean isStorage;
		private boolean isDownloadFile;
		private boolean isDataRoot;
		private boolean isConfigJSONFile;
		private boolean isStrorageTreeStructureJSONFile;
		
		//if directory
		private Integer numOfFilesLimit;
		
		// if storage
		private Long storageSize;
		private Set<String> unsupportedFiles = new HashSet<>();
		
		public FileMetadataBuilder withFileID(String ID) {
			this.fileID = ID;
			return this;
		}
		public FileMetadataBuilder withName(String name) {
			this.name = name;
			return this;
		}
		public FileMetadataBuilder withTimeCreated(Date timeCreated) {
			this.timeCreated = timeCreated;
			return this;
		}
		public FileMetadataBuilder withTimeModified(Date timeModified) {
			this.timeModified = timeModified;
			return this;
		}
		public FileMetadataBuilder withAbsolutePath(String absolutePath) {
			this.absolutePath = absolutePath;
			return this;
		}
		public FileMetadataBuilder withParent(FileMetadata parent) {
			this.parent = parent;
			return this;
		}
		public FileMetadataBuilder withIsFile(boolean isFile) {
			this.isFile = isFile;
			return this;
		}
		public FileMetadataBuilder withIsDirectory(boolean isDirectory) {
			this.isDirectory = isDirectory;
			return this;
		}
		public FileMetadataBuilder withIsStorage(boolean isStorage) {
			this.isStorage = isStorage;
			return this;
		}
		public FileMetadataBuilder withIsDownloadFile(boolean isDownloadFile) {
			this.isDownloadFile = isDownloadFile;
			return this;
		}
		public FileMetadataBuilder withIsDataRoot(boolean isDataRoot) {
			this.isDataRoot = isDataRoot; 
			return this;
		}
		public FileMetadataBuilder withIsConfigJSONFile(boolean isConfigJSONFile) {
			this.isConfigJSONFile = isConfigJSONFile;
			return this;
		}
		public FileMetadataBuilder withIsStrorageTreeStructureJSONFile(boolean isStrorageTreeStructureJSONFile) {
			this.isStrorageTreeStructureJSONFile = isStrorageTreeStructureJSONFile;
			return this;
		}
		public FileMetadataBuilder withNumOfFilesLimit(Integer num) {
			this.numOfFilesLimit = num;
			return this;
		}
		public FileMetadataBuilder withUnsupportedFiles(Set<String> unsupportedFiles) {
			this.unsupportedFiles = unsupportedFiles;
			return this;
		}
		public FileMetadataBuilder withStorageSize(Long size) {
			this.storageSize = size;
			return this;
		}
		
		public FileMetadata build() {
			return new FileMetadata(this);
		}
	}
	
}
