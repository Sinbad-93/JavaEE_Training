package com.octest.beans;

public class Auteur {

		private String name;
		private String famillyName;
		private boolean actif;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFamillyName() {
			return famillyName;
		}
		public void setFamillyName(String famillyName) {
			this.famillyName = famillyName;
		}
		public boolean isActif() {
			return actif;
		}
		public void setActif(boolean actif) {
			this.actif = actif;
		}
}
