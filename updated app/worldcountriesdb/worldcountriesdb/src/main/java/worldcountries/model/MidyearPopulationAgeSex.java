package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "MIDYEAR_POPULATION_AFE_SEX")
public class MidyearPopulationAgeSex {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "PAS_COUNTRY_ID")
	private int pas_country_id;
		
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "PAS_YEAR")
	private int pas_year;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "SEX")
	private String sex;
	
	@Column(name = "COUNTRY_CODE")
	private String country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "MAX_AGE")
	private int max_age;
	
	@Column(name = "POPULATION_AGE_0")
	private int pop_age_0;
	
	@Column(name = "POPULATION_AGE_1")
	private int pop_age_1;
	
	@Column(name = "POPULATION_AGE_2")
	private int pop_age_2;
	
	@Column(name = "POPULATION_AGE_3")
	private int pop_age_3;
	
	@Column(name = "POPULATION_AGE_4")
	private int pop_age_4;
	
	@Column(name = "POPULATION_AGE_5")
	private int pop_age_5;
	
	@Column(name = "POPULATION_AGE_6")
	private int pop_age_6;
	
	@Column(name = "POPULATION_AGE_7")
	private int pop_age_7;
	
	@Column(name = "POPULATION_AGE_8")
	private int pop_age_8;
	
	@Column(name = "POPULATION_AGE_9")
	private int pop_age_9;
	
	@Column(name = "POPULATION_AGE_10")
	private int pop_age_10;
	
	@Column(name = "POPULATION_AGE_11")
	private int pop_age_11;
	
	@Column(name = "POPULATION_AGE_12")
	private int pop_age_12;
	
	@Column(name = "POPULATION_AGE_13")
	private int pop_age_13;
	
	@Column(name = "POPULATION_AGE_14")
	private int pop_age_14;
	
	@Column(name = "POPULATION_AGE_15")
	private int pop_age_15;
	
	@Column(name = "POPULATION_AGE_16")
	private int pop_age_16;
	
	@Column(name = "POPULATION_AGE_17")
	private int pop_age_17;
	
	@Column(name = "POPULATION_AGE_18")
	private int pop_age_18;
	
	@Column(name = "POPULATION_AGE_19")
	private int pop_age_19;
	
	@Column(name = "POPULATION_AGE_20")
	private int pop_age_20;
	
	@Column(name = "POPULATION_AGE_21")
	private int pop_age_21;
	
	@Column(name = "POPULATION_AGE_22")
	private int pop_age_22;
	
	@Column(name = "POPULATION_AGE_23")
	private int pop_age_23;
	
	@Column(name = "POPULATION_AGE_24")
	private int pop_age_24;
	
	@Column(name = "POPULATION_AGE_25")
	private int pop_age_25;
	
	@Column(name = "POPULATION_AGE_26")
	private int pop_age_26;
	
	@Column(name = "POPULATION_AGE_27")
	private int pop_age_27;
	
	@Column(name = "POPULATION_AGE_28")
	private int pop_age_28;
	
	@Column(name = "POPULATION_AGE_29")
	private int pop_age_29;
	
	@Column(name = "POPULATION_AGE_30")
	private int pop_age_30;
	
	@Column(name = "POPULATION_AGE_31")
	private int pop_age_31;
	
	@Column(name = "POPULATION_AGE_32")
	private int pop_age_32;
	
	@Column(name = "POPULATION_AGE_33")
	private int pop_age_33;
	
	@Column(name = "POPULATION_AGE_34")
	private int pop_age_34;
	
	@Column(name = "POPULATION_AGE_35")
	private int pop_age_35;
	
	@Column(name = "POPULATION_AGE_36")
	private int pop_age_36;
	
	@Column(name = "POPULATION_AGE_37")
	private int pop_age_37;
	
	@Column(name = "POPULATION_AGE_38")
	private int pop_age_38;
	
	@Column(name = "POPULATION_AGE_39")
	private int pop_age_39;
	
	@Column(name = "POPULATION_AGE_40")
	private int pop_age_40;
	
	@Column(name = "POPULATION_AGE_41")
	private int pop_age_41;
	
	@Column(name = "POPULATION_AGE_42")
	private int pop_age_42;
	
	@Column(name = "POPULATION_AGE_43")
	private int pop_age_43;
	
	@Column(name = "POPULATION_AGE_44")
	private int pop_age_44;
	
	@Column(name = "POPULATION_AGE_45")
	private int pop_age_45;
	
	@Column(name = "POPULATION_AGE_46")
	private int pop_age_46;
	
	@Column(name = "POPULATION_AGE_47")
	private int pop_age_47;
	
	@Column(name = "POPULATION_AGE_48")
	private int pop_age_48;
	
	@Column(name = "POPULATION_AGE_49")
	private int pop_age_49;
	
	@Column(name = "POPULATION_AGE_50")
	private int pop_age_50;
	
	@Column(name = "POPULATION_AGE_51")
	private int pop_age_51;
	
	@Column(name = "POPULATION_AGE_52")
	private int pop_age_52;
	
	@Column(name = "POPULATION_AGE_53")
	private int pop_age_53;
	
	@Column(name = "POPULATION_AGE_54")
	private int pop_age_54;
	
	@Column(name = "POPULATION_AGE_55")
	private int pop_age_55;
	
	@Column(name = "POPULATION_AGE_56")
	private int pop_age_56;
	
	@Column(name = "POPULATION_AGE_57")
	private int pop_age_57;
	
	@Column(name = "POPULATION_AGE_58")
	private int pop_age_58;
	
	@Column(name = "POPULATION_AGE_59")
	private int pop_age_59;
	
	@Column(name = "POPULATION_AGE_60")
	private int pop_age_60;
	
	@Column(name = "POPULATION_AGE_61")
	private int pop_age_61;
	
	@Column(name = "POPULATION_AGE_62")
	private int pop_age_62;
	
	@Column(name = "POPULATION_AGE_63")
	private int pop_age_63;
	
	@Column(name = "POPULATION_AGE_64")
	private int pop_age_64;
	
	@Column(name = "POPULATION_AGE_65")
	private int pop_age_65;
	
	@Column(name = "POPULATION_AGE_66")
	private int pop_age_66;
	
	@Column(name = "POPULATION_AGE_67")
	private int pop_age_67;
	
	@Column(name = "POPULATION_AGE_68")
	private int pop_age_68;
	
	@Column(name = "POPULATION_AGE_69")
	private int pop_age_69;
	
	@Column(name = "POPULATION_AGE_70")
	private int pop_age_70;
	
	@Column(name = "POPULATION_AGE_71")
	private int pop_age_71;
	
	@Column(name = "POPULATION_AGE_72")
	private int pop_age_72;
	
	@Column(name = "POPULATION_AGE_73")
	private int pop_age_73;
	
	@Column(name = "POPULATION_AGE_74")
	private int pop_age_74;
	
	@Column(name = "POPULATION_AGE_75")
	private int pop_age_75;
	
	@Column(name = "POPULATION_AGE_76")
	private int pop_age_76;
	
	@Column(name = "POPULATION_AGE_77")
	private int pop_age_77;
	
	@Column(name = "POPULATION_AGE_78")
	private int pop_age_78;
	
	@Column(name = "POPULATION_AGE_79")
	private int pop_age_79;
	
	@Column(name = "POPULATION_AGE_80")
	private int pop_age_80;
	
	@Column(name = "POPULATION_AGE_81")
	private int pop_age_81;
	
	@Column(name = "POPULATION_AGE_82")
	private int pop_age_82;
	
	@Column(name = "POPULATION_AGE_83")
	private int pop_age_83;
	
	@Column(name = "POPULATION_AGE_84")
	private int pop_age_84;
	
	@Column(name = "POPULATION_AGE_85")
	private int pop_age_85;
	
	@Column(name = "POPULATION_AGE_86")
	private int pop_age_86;
	
	@Column(name = "POPULATION_AGE_87")
	private int pop_age_87;
	
	@Column(name = "POPULATION_AGE_88")
	private int pop_age_88;
	
	@Column(name = "POPULATION_AGE_89")
	private int pop_age_89;
	
	@Column(name = "POPULATION_AGE_90")
	private int pop_age_90;
	
	@Column(name = "POPULATION_AGE_91")
	private int pop_age_91;
	
	@Column(name = "POPULATION_AGE_92")
	private int pop_age_92;
	
	@Column(name = "POPULATION_AGE_93")
	private int pop_age_93;
	
	@Column(name = "POPULATION_AGE_94")
	private int pop_age_94;
	
	@Column(name = "POPULATION_AGE_95")
	private int pop_age_95;
	
	@Column(name = "POPULATION_AGE_96")
	private int pop_age_96;
	
	@Column(name = "POPULATION_AGE_97")
	private int pop_age_97;
	
	@Column(name = "POPULATION_AGE_98")
	private int pop_age_98;
	
	@Column(name = "POPULATION_AGE_99")
	private int pop_age_99;
	
	@Column(name = "POPULATION_AGE_100")
	private int pop_age_100;
	
	
	// CONSTRUCTORS
	public MidyearPopulationAgeSex() {}
	
	public MidyearPopulationAgeSex(int pas_country_id, int pas_year, String sex) {
		this.pas_country_id = pas_country_id;
		this.pas_year = pas_year;
		this.sex = sex;
	}
	
	
	// SETTERS & GETTERS
	public int getPas_country_id() {
		return pas_country_id;
	}

	public void setPas_country_id(int pas_country_id) {
		this.pas_country_id = pas_country_id;
	}

	public int getPas_year() {
		return pas_year;
	}

	public void setPas_year(int pas_year) {
		this.pas_year = pas_year;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public int getMax_age() {
		return max_age;
	}

	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}

	public int getPop_age_0() {
		return pop_age_0;
	}

	public void setPop_age_0(int pop_age_0) {
		this.pop_age_0 = pop_age_0;
	}

	public int getPop_age_1() {
		return pop_age_1;
	}

	public void setPop_age_1(int pop_age_1) {
		this.pop_age_1 = pop_age_1;
	}

	public int getPop_age_2() {
		return pop_age_2;
	}

	public void setPop_age_2(int pop_age_2) {
		this.pop_age_2 = pop_age_2;
	}

	public int getPop_age_3() {
		return pop_age_3;
	}

	public void setPop_age_3(int pop_age_3) {
		this.pop_age_3 = pop_age_3;
	}

	public int getPop_age_4() {
		return pop_age_4;
	}

	public void setPop_age_4(int pop_age_4) {
		this.pop_age_4 = pop_age_4;
	}

	public int getPop_age_5() {
		return pop_age_5;
	}

	public void setPop_age_5(int pop_age_5) {
		this.pop_age_5 = pop_age_5;
	}

	public int getPop_age_6() {
		return pop_age_6;
	}

	public void setPop_age_6(int pop_age_6) {
		this.pop_age_6 = pop_age_6;
	}

	public int getPop_age_7() {
		return pop_age_7;
	}

	public void setPop_age_7(int pop_age_7) {
		this.pop_age_7 = pop_age_7;
	}

	public int getPop_age_8() {
		return pop_age_8;
	}

	public void setPop_age_8(int pop_age_8) {
		this.pop_age_8 = pop_age_8;
	}

	public int getPop_age_9() {
		return pop_age_9;
	}

	public void setPop_age_9(int pop_age_9) {
		this.pop_age_9 = pop_age_9;
	}

	public int getPop_age_10() {
		return pop_age_10;
	}

	public void setPop_age_10(int pop_age_10) {
		this.pop_age_10 = pop_age_10;
	}

	public int getPop_age_11() {
		return pop_age_11;
	}

	public void setPop_age_11(int pop_age_11) {
		this.pop_age_11 = pop_age_11;
	}

	public int getPop_age_12() {
		return pop_age_12;
	}

	public void setPop_age_12(int pop_age_12) {
		this.pop_age_12 = pop_age_12;
	}

	public int getPop_age_13() {
		return pop_age_13;
	}

	public void setPop_age_13(int pop_age_13) {
		this.pop_age_13 = pop_age_13;
	}

	public int getPop_age_14() {
		return pop_age_14;
	}

	public void setPop_age_14(int pop_age_14) {
		this.pop_age_14 = pop_age_14;
	}

	public int getPop_age_15() {
		return pop_age_15;
	}

	public void setPop_age_15(int pop_age_15) {
		this.pop_age_15 = pop_age_15;
	}

	public int getPop_age_16() {
		return pop_age_16;
	}

	public void setPop_age_16(int pop_age_16) {
		this.pop_age_16 = pop_age_16;
	}

	public int getPop_age_17() {
		return pop_age_17;
	}

	public void setPop_age_17(int pop_age_17) {
		this.pop_age_17 = pop_age_17;
	}

	public int getPop_age_18() {
		return pop_age_18;
	}

	public void setPop_age_18(int pop_age_18) {
		this.pop_age_18 = pop_age_18;
	}

	public int getPop_age_19() {
		return pop_age_19;
	}

	public void setPop_age_19(int pop_age_19) {
		this.pop_age_19 = pop_age_19;
	}

	public int getPop_age_20() {
		return pop_age_20;
	}

	public void setPop_age_20(int pop_age_20) {
		this.pop_age_20 = pop_age_20;
	}

	public int getPop_age_21() {
		return pop_age_21;
	}

	public void setPop_age_21(int pop_age_21) {
		this.pop_age_21 = pop_age_21;
	}

	public int getPop_age_22() {
		return pop_age_22;
	}

	public void setPop_age_22(int pop_age_22) {
		this.pop_age_22 = pop_age_22;
	}

	public int getPop_age_23() {
		return pop_age_23;
	}

	public void setPop_age_23(int pop_age_23) {
		this.pop_age_23 = pop_age_23;
	}

	public int getPop_age_24() {
		return pop_age_24;
	}

	public void setPop_age_24(int pop_age_24) {
		this.pop_age_24 = pop_age_24;
	}

	public int getPop_age_25() {
		return pop_age_25;
	}

	public void setPop_age_25(int pop_age_25) {
		this.pop_age_25 = pop_age_25;
	}

	public int getPop_age_26() {
		return pop_age_26;
	}

	public void setPop_age_26(int pop_age_26) {
		this.pop_age_26 = pop_age_26;
	}

	public int getPop_age_27() {
		return pop_age_27;
	}

	public void setPop_age_27(int pop_age_27) {
		this.pop_age_27 = pop_age_27;
	}

	public int getPop_age_28() {
		return pop_age_28;
	}

	public void setPop_age_28(int pop_age_28) {
		this.pop_age_28 = pop_age_28;
	}

	public int getPop_age_29() {
		return pop_age_29;
	}

	public void setPop_age_29(int pop_age_29) {
		this.pop_age_29 = pop_age_29;
	}

	public int getPop_age_30() {
		return pop_age_30;
	}

	public void setPop_age_30(int pop_age_30) {
		this.pop_age_30 = pop_age_30;
	}

	public int getPop_age_31() {
		return pop_age_31;
	}

	public void setPop_age_31(int pop_age_31) {
		this.pop_age_31 = pop_age_31;
	}

	public int getPop_age_32() {
		return pop_age_32;
	}

	public void setPop_age_32(int pop_age_32) {
		this.pop_age_32 = pop_age_32;
	}

	public int getPop_age_33() {
		return pop_age_33;
	}

	public void setPop_age_33(int pop_age_33) {
		this.pop_age_33 = pop_age_33;
	}

	public int getPop_age_34() {
		return pop_age_34;
	}

	public void setPop_age_34(int pop_age_34) {
		this.pop_age_34 = pop_age_34;
	}

	public int getPop_age_35() {
		return pop_age_35;
	}

	public void setPop_age_35(int pop_age_35) {
		this.pop_age_35 = pop_age_35;
	}

	public int getPop_age_36() {
		return pop_age_36;
	}

	public void setPop_age_36(int pop_age_36) {
		this.pop_age_36 = pop_age_36;
	}

	public int getPop_age_37() {
		return pop_age_37;
	}

	public void setPop_age_37(int pop_age_37) {
		this.pop_age_37 = pop_age_37;
	}

	public int getPop_age_38() {
		return pop_age_38;
	}

	public void setPop_age_38(int pop_age_38) {
		this.pop_age_38 = pop_age_38;
	}

	public int getPop_age_39() {
		return pop_age_39;
	}

	public void setPop_age_39(int pop_age_39) {
		this.pop_age_39 = pop_age_39;
	}

	public int getPop_age_40() {
		return pop_age_40;
	}

	public void setPop_age_40(int pop_age_40) {
		this.pop_age_40 = pop_age_40;
	}

	public int getPop_age_41() {
		return pop_age_41;
	}

	public void setPop_age_41(int pop_age_41) {
		this.pop_age_41 = pop_age_41;
	}

	public int getPop_age_42() {
		return pop_age_42;
	}

	public void setPop_age_42(int pop_age_42) {
		this.pop_age_42 = pop_age_42;
	}

	public int getPop_age_43() {
		return pop_age_43;
	}

	public void setPop_age_43(int pop_age_43) {
		this.pop_age_43 = pop_age_43;
	}

	public int getPop_age_44() {
		return pop_age_44;
	}

	public void setPop_age_44(int pop_age_44) {
		this.pop_age_44 = pop_age_44;
	}

	public int getPop_age_45() {
		return pop_age_45;
	}

	public void setPop_age_45(int pop_age_45) {
		this.pop_age_45 = pop_age_45;
	}

	public int getPop_age_46() {
		return pop_age_46;
	}

	public void setPop_age_46(int pop_age_46) {
		this.pop_age_46 = pop_age_46;
	}

	public int getPop_age_47() {
		return pop_age_47;
	}

	public void setPop_age_47(int pop_age_47) {
		this.pop_age_47 = pop_age_47;
	}

	public int getPop_age_48() {
		return pop_age_48;
	}

	public void setPop_age_48(int pop_age_48) {
		this.pop_age_48 = pop_age_48;
	}

	public int getPop_age_49() {
		return pop_age_49;
	}

	public void setPop_age_49(int pop_age_49) {
		this.pop_age_49 = pop_age_49;
	}

	public int getPop_age_50() {
		return pop_age_50;
	}

	public void setPop_age_50(int pop_age_50) {
		this.pop_age_50 = pop_age_50;
	}

	public int getPop_age_51() {
		return pop_age_51;
	}

	public void setPop_age_51(int pop_age_51) {
		this.pop_age_51 = pop_age_51;
	}

	public int getPop_age_52() {
		return pop_age_52;
	}

	public void setPop_age_52(int pop_age_52) {
		this.pop_age_52 = pop_age_52;
	}

	public int getPop_age_53() {
		return pop_age_53;
	}

	public void setPop_age_53(int pop_age_53) {
		this.pop_age_53 = pop_age_53;
	}

	public int getPop_age_54() {
		return pop_age_54;
	}

	public void setPop_age_54(int pop_age_54) {
		this.pop_age_54 = pop_age_54;
	}

	public int getPop_age_55() {
		return pop_age_55;
	}

	public void setPop_age_55(int pop_age_55) {
		this.pop_age_55 = pop_age_55;
	}

	public int getPop_age_56() {
		return pop_age_56;
	}

	public void setPop_age_56(int pop_age_56) {
		this.pop_age_56 = pop_age_56;
	}

	public int getPop_age_57() {
		return pop_age_57;
	}

	public void setPop_age_57(int pop_age_57) {
		this.pop_age_57 = pop_age_57;
	}

	public int getPop_age_58() {
		return pop_age_58;
	}

	public void setPop_age_58(int pop_age_58) {
		this.pop_age_58 = pop_age_58;
	}

	public int getPop_age_59() {
		return pop_age_59;
	}

	public void setPop_age_59(int pop_age_59) {
		this.pop_age_59 = pop_age_59;
	}

	public int getPop_age_60() {
		return pop_age_60;
	}

	public void setPop_age_60(int pop_age_60) {
		this.pop_age_60 = pop_age_60;
	}

	public int getPop_age_61() {
		return pop_age_61;
	}

	public void setPop_age_61(int pop_age_61) {
		this.pop_age_61 = pop_age_61;
	}

	public int getPop_age_62() {
		return pop_age_62;
	}

	public void setPop_age_62(int pop_age_62) {
		this.pop_age_62 = pop_age_62;
	}

	public int getPop_age_63() {
		return pop_age_63;
	}

	public void setPop_age_63(int pop_age_63) {
		this.pop_age_63 = pop_age_63;
	}

	public int getPop_age_64() {
		return pop_age_64;
	}

	public void setPop_age_64(int pop_age_64) {
		this.pop_age_64 = pop_age_64;
	}

	public int getPop_age_65() {
		return pop_age_65;
	}

	public void setPop_age_65(int pop_age_65) {
		this.pop_age_65 = pop_age_65;
	}

	public int getPop_age_66() {
		return pop_age_66;
	}

	public void setPop_age_66(int pop_age_66) {
		this.pop_age_66 = pop_age_66;
	}

	public int getPop_age_67() {
		return pop_age_67;
	}

	public void setPop_age_67(int pop_age_67) {
		this.pop_age_67 = pop_age_67;
	}

	public int getPop_age_68() {
		return pop_age_68;
	}

	public void setPop_age_68(int pop_age_68) {
		this.pop_age_68 = pop_age_68;
	}

	public int getPop_age_69() {
		return pop_age_69;
	}

	public void setPop_age_69(int pop_age_69) {
		this.pop_age_69 = pop_age_69;
	}

	public int getPop_age_70() {
		return pop_age_70;
	}

	public void setPop_age_70(int pop_age_70) {
		this.pop_age_70 = pop_age_70;
	}

	public int getPop_age_71() {
		return pop_age_71;
	}

	public void setPop_age_71(int pop_age_71) {
		this.pop_age_71 = pop_age_71;
	}

	public int getPop_age_72() {
		return pop_age_72;
	}

	public void setPop_age_72(int pop_age_72) {
		this.pop_age_72 = pop_age_72;
	}

	public int getPop_age_73() {
		return pop_age_73;
	}

	public void setPop_age_73(int pop_age_73) {
		this.pop_age_73 = pop_age_73;
	}

	public int getPop_age_74() {
		return pop_age_74;
	}

	public void setPop_age_74(int pop_age_74) {
		this.pop_age_74 = pop_age_74;
	}

	public int getPop_age_75() {
		return pop_age_75;
	}

	public void setPop_age_75(int pop_age_75) {
		this.pop_age_75 = pop_age_75;
	}

	public int getPop_age_76() {
		return pop_age_76;
	}

	public void setPop_age_76(int pop_age_76) {
		this.pop_age_76 = pop_age_76;
	}

	public int getPop_age_77() {
		return pop_age_77;
	}

	public void setPop_age_77(int pop_age_77) {
		this.pop_age_77 = pop_age_77;
	}

	public int getPop_age_78() {
		return pop_age_78;
	}

	public void setPop_age_78(int pop_age_78) {
		this.pop_age_78 = pop_age_78;
	}

	public int getPop_age_79() {
		return pop_age_79;
	}

	public void setPop_age_79(int pop_age_79) {
		this.pop_age_79 = pop_age_79;
	}

	public int getPop_age_80() {
		return pop_age_80;
	}

	public void setPop_age_80(int pop_age_80) {
		this.pop_age_80 = pop_age_80;
	}

	public int getPop_age_81() {
		return pop_age_81;
	}

	public void setPop_age_81(int pop_age_81) {
		this.pop_age_81 = pop_age_81;
	}

	public int getPop_age_82() {
		return pop_age_82;
	}

	public void setPop_age_82(int pop_age_82) {
		this.pop_age_82 = pop_age_82;
	}

	public int getPop_age_83() {
		return pop_age_83;
	}

	public void setPop_age_83(int pop_age_83) {
		this.pop_age_83 = pop_age_83;
	}

	public int getPop_age_84() {
		return pop_age_84;
	}

	public void setPop_age_84(int pop_age_84) {
		this.pop_age_84 = pop_age_84;
	}

	public int getPop_age_85() {
		return pop_age_85;
	}

	public void setPop_age_85(int pop_age_85) {
		this.pop_age_85 = pop_age_85;
	}

	public int getPop_age_86() {
		return pop_age_86;
	}

	public void setPop_age_86(int pop_age_86) {
		this.pop_age_86 = pop_age_86;
	}

	public int getPop_age_87() {
		return pop_age_87;
	}

	public void setPop_age_87(int pop_age_87) {
		this.pop_age_87 = pop_age_87;
	}

	public int getPop_age_88() {
		return pop_age_88;
	}

	public void setPop_age_88(int pop_age_88) {
		this.pop_age_88 = pop_age_88;
	}

	public int getPop_age_89() {
		return pop_age_89;
	}

	public void setPop_age_89(int pop_age_89) {
		this.pop_age_89 = pop_age_89;
	}

	public int getPop_age_90() {
		return pop_age_90;
	}

	public void setPop_age_90(int pop_age_90) {
		this.pop_age_90 = pop_age_90;
	}

	public int getPop_age_91() {
		return pop_age_91;
	}

	public void setPop_age_91(int pop_age_91) {
		this.pop_age_91 = pop_age_91;
	}

	public int getPop_age_92() {
		return pop_age_92;
	}

	public void setPop_age_92(int pop_age_92) {
		this.pop_age_92 = pop_age_92;
	}

	public int getPop_age_93() {
		return pop_age_93;
	}

	public void setPop_age_93(int pop_age_93) {
		this.pop_age_93 = pop_age_93;
	}

	public int getPop_age_94() {
		return pop_age_94;
	}

	public void setPop_age_94(int pop_age_94) {
		this.pop_age_94 = pop_age_94;
	}

	public int getPop_age_95() {
		return pop_age_95;
	}

	public void setPop_age_95(int pop_age_95) {
		this.pop_age_95 = pop_age_95;
	}

	public int getPop_age_96() {
		return pop_age_96;
	}

	public void setPop_age_96(int pop_age_96) {
		this.pop_age_96 = pop_age_96;
	}

	public int getPop_age_97() {
		return pop_age_97;
	}

	public void setPop_age_97(int pop_age_97) {
		this.pop_age_97 = pop_age_97;
	}

	public int getPop_age_98() {
		return pop_age_98;
	}

	public void setPop_age_98(int pop_age_98) {
		this.pop_age_98 = pop_age_98;
	}

	public int getPop_age_99() {
		return pop_age_99;
	}

	public void setPop_age_99(int pop_age_99) {
		this.pop_age_99 = pop_age_99;
	}

	public int getPop_age_100() {
		return pop_age_100;
	}

	public void setPop_age_100(int pop_age_100) {
		this.pop_age_100 = pop_age_100;
	}

}
