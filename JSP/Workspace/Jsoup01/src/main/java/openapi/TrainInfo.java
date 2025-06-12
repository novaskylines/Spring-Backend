package openapi;

public class TrainInfo {

	private String traingradename;
	private String depplandtime;
	private String arrplandtime;
	private String depplacename;
	private String arrplacename;
	private String adultcharge;
	private String trainno;
	
	public String serviceKey = "Vp4vq1r%2B2DPFqpBPVGc7dzY88rzqqUtkcPR543cPnm1nVm0vPqYBRiU4YyXg1bCmp2pe%2B0lvenhcxts8hnkPxw%3D%3D";

	public TrainInfo() {
	}

	public TrainInfo(String traingradename, String depplandtime, String arrplandtime, String depplacename,
			String arrplacename, String adultcharge, String trainno) {
		super();
		this.traingradename = traingradename;
		this.depplandtime = depplandtime;
		this.arrplandtime = arrplandtime;
		this.depplacename = depplacename;
		this.arrplacename = arrplacename;
		this.adultcharge = adultcharge;
		this.trainno = trainno;
	}

	public String getTraingradename() {
		return traingradename;
	}

	public void setTraingradename(String traingradename) {
		this.traingradename = traingradename;
	}

	public String getDepplandtime() {
		return depplandtime;
	}

	public void setDepplandtime(String depplandtime) {
		this.depplandtime = depplandtime;
	}

	public String getArrplandtime() {
		return arrplandtime;
	}

	public void setArrplandtime(String arrplandtime) {
		this.arrplandtime = arrplandtime;
	}

	public String getDepplacename() {
		return depplacename;
	}

	public void setDepplacename(String depplacename) {
		this.depplacename = depplacename;
	}

	public String getArrplacename() {
		return arrplacename;
	}

	public void setArrplacename(String arrplacename) {
		this.arrplacename = arrplacename;
	}

	public String getAdultcharge() {
		return adultcharge;
	}

	public void setAdultcharge(String adultcharge) {
		this.adultcharge = adultcharge;
	}

	public String getTrainno() {
		return trainno;
	}

	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}
	
	
}
