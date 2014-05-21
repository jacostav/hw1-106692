

/* First created by JCasGen Fri Feb 14 19:43:15 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Feb 15 12:39:56 CST 2014
 * XML source: C:/Users/George/Desktop/eclipse/projectos/hw1-ID/src/main/resources/hw1-106692-typesystem.xml
 * @generated */
public class Question extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: Answers

  /** getter for Answers - gets Building containing this room
   * @generated
   * @return value of the feature 
   */
  public Answer getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "Question");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_Answers)));}
    
  /** setter for Answers - sets Building containing this room 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(Answer v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_Answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    