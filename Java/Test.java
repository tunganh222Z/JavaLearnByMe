//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//    }
//
//    public void updateCustomer(String cusId,String userName, String cusName, String nationalId, String phone, String dob, String residence, String gender, String branchCode, String sector, String email, String rm, String kyc) {
//
//        MongoDatabase database = connectMongo.getDatabase("PARTY_DATA_MANAGEMENT");
//        MongoCollection<Document> collection = database.getCollection("CUSTOMER_FINAL");
//
//        //retry get info
//        for (int i = 1; i <= 10; i++) {
//            try {
//                log.info("Sleep 10s đồng bộ data sang Mongodb...");
//                Thread.sleep(Long.parseLong("10000"));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Document doc = collection.find(and(
//                    eq("CUST_ID", cusId),
//                    eq("NATIONAL_ID", nationalId)
//            )).first();
//            //eq("KYC_COMPLETE", "YES")
//            log.info(doc);
//            if (doc != null) {
//                return;
//            }
//        }
//        // remove bản ghi nếu có -> insert bản ghi mới
//        collection.deleteOne(and(eq("CUST_ID", cusId)));
//        //insert bản ghi vào bảng
//        if(residence == null) residence = "VN";
//        String filePath = FilePathConstants.REQUEST_BODY + "/mongodb/customer.json";
//        String finalJson = Extends.instance(utilities.readAllText(filePath))
//                .merge("custId", cusId)
//                .merge("username", userName)
//                .merge("cusName", cusName)
//                .merge("phone", phone)
//                .merge("cre_cus.birthIncorpDate", dob)
//                .merge("nationalId", nationalId)
//                .merge("residence", residence)
//                .merge("gender", gender)
//                .merge("branchCode", branchCode)
//                .merge("cre_cus.sector", sector)
//                .merge("email", email)
//                .merge("emailUpperCase", email.toUpperCase())
//                .merge("rm", rm)
//                .merge("kyc", kyc)
//                .toString();
//        Document docInsert = Document.parse(finalJson);
//        log.info(docInsert);
//        collection.insertOne(docInsert);
//        log.info("Insert thành công!");
//
//
//}
//
//    public void scheduleDinhKyTuInput(CreateLdRequest currentInput) {
//        String prFreq = null;
//        String intFreq = null;
//        String prDate = null;
//        String intDate = null;
//        String date = null;
//        Calendar firstDate = null;
//        Calendar firstDateI = null;
//        Calendar firstDateP = null;
//        if (currentInput.getScheduleInfoList() != null) {
//            for (ScheduleInfoList item : currentInput.getScheduleInfoList()) {
//                date = String.valueOf(Extends.instance(item.getScheduleFirstDate()).toDateSupport(FormatDateTime.YYYY_MM_DD_WITHOUT_MINUS).toCalendar().get(Calendar.DAY_OF_MONTH));
//                firstDate = Extends.instance(item.getScheduleFirstDate()).toCalendar(FormatDateTime.YYYY_MM_DD_WITHOUT_MINUS);
//                if (item.getScheduleType() != null && item.getScheduleType().equals("P")) {
//                    prFreq = item.getScheduleFred();
//                    prDate = date;
//                    firstDateP = firstDate;
//                }
//                if (item.getScheduleType() != null && item.getScheduleType().equals("I")) {
//                    firstDateI = firstDate;
//                    intFreq = item.getScheduleFred();
//                    intDate = date;
//                }
//            }
//        } else {
//            prDate = paramModel.getPrDate();
//            prFreq = paramModel.getPrFreq();
//            intDate = paramModel.getIntDate();
//            intFreq = paramModel.getIntFreq();
//        }
//        if (paramModel.getInterestType().equals("2")) {
//            getBasicInterest();
//
//            scheduleResult = ScheduleDefine.getInstance(((CreateLdRequest) inputModel).getLoanTerm())
//                    .setAmount(((CreateLdRequest) inputModel).getLoanAmount())
//                    .setCalendarP(new ScheduleInfo(prDate, prFreq))
//                    .setCalendarI(new ScheduleInfo(intDate, intFreq))
//                    .setCalendarR(new ScheduleInfo(String.valueOf(Extends.instance(T24.toDay()).toLocalDate().getDayOfMonth()), basicInterest.getAdjTerm()))
//                    .calculator();
//        } else {
//            scheduleResult = ScheduleDefine.getInstance(((CreateLdRequest) inputModel).getLoanTerm())
//                    .setAmount(((CreateLdRequest) inputModel).getLoanAmount())
//                    .setCalendarP(new ScheduleInfo(prDate, prFreq))
//                    .setCalendarI(new ScheduleInfo(intDate, intFreq))
//                    .setSkipR()
//                    .calculator();
//
//
//        }
//        utilities.serenityReport("scheduleResult", scheduleResult);
//    }
//
//    public class GenerateDataTestVayModel {
//        public GenerateDataTestVayModel() {
//        }
//
//        public GenerateDataTestVayModel(String testcase, DataOutputObject dataOutput, Map<String,Object> inputJson, Actions action) {
//            testcase = testcase.replace("{date}", Extends.instance(new Date()).format(FormatDateTime.YYYY_MM_DD_WITHOUT_MINUS));
//            this.setActions(action.toString());
//            this.setTestcaseName(testcase);
//            this.setBodyJson(Extends.instance(inputJson).toJsonString());
//            this.setCustomerId(dataOutput.getCustomerId());
//            this.setT24Name(dataOutput.getUserName());
//            this.setChargeAccount(dataOutput.getCustomerAccount());
//            this.setNationalId(dataOutput.getNationalId());
//            this.setMobileNumber(dataOutput.getPhone());
//            this.setListCollecteral(Utilities.convertModelToMapper(dataOutput.getListSTK()));
//            this.setCardId(dataOutput.getCardId());
//            this.setLoanId(dataOutput.getLoanId());
//            this.setValid("YES");
//            this.setHrisId(dataOutput.getEmployeeId());
//        }
//
//        @ColumnMapping(name = ColumnNameGenDataDb.LOAN_TYPE)
//        String loanType;
//        setConfig(dataTest.getLoanType());
//
//        SqlPrepare sqlPrepare = SqlManager.select().from(TableNameDb.MicroDb.GENERATE_DATATEST_VAY).where(
//                WhereCondition.and(ColumnNameGenDataDb.TESTCASE_NAME).equalTo(testCase).groupWith(
//                        WhereCondition.or(ColumnNameGenDataDb.TESTCASE_NAME).like(testCase.replace("_" + System.getProperty("user.name"), ""))
//                ),
//                WhereCondition.and(ColumnNameGenDataDb.ACTIONS).equalTo(actions),
//                WhereCondition.and(ColumnNameGenDataDb.VALID).equalTo("YES")
//        ).orderByDescending("ID").build();
//
//        public DataOutputObject dataOutput = NodeManager.getInstance(DataOutputObject.class);
//        public SaveManager saveManager = NodeManager.getInstance(SaveManager.class);
//saveManager.dataOutput.getBranchCode())
//
//
///*
//thêm các ký tự vào trong mảng boolean
//    - nếu chưa có thì set là true
//    lặp qua
//**/