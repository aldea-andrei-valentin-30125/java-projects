package utcn.repoviewer;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;

 public class FileNode extends DefaultMutableTreeNode {
        private File file;
        private String alternativeName = "";
        protected boolean isViewableFile; // true if this is a file, false if it is a folder
        public FileNode(File file) {
            this.file = file;
            this.isViewableFile = file.isFile();
        }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    @Override
        public String toString() {

            String name = file.getName();
            if (name.equals("")) {
                return file.getAbsolutePath();
            } else if(!alternativeName.isBlank()){
                return alternativeName;
            } else {
                return name;
            }
        }
        
    public String getAbsolutePath(){
        return file.getAbsolutePath();
    }
    }
