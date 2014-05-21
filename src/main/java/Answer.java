

/* First created by JCasGen Fri Feb 14 19:43:15 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Feb 15 12:39:56 CST 2014
 * XML source: C:/Users/George/Desktop/eclipse/projectos/hw1-ID/src/main/resources/hw1-106692-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: Score

  /** getter for Score - gets Building containing this room
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets Building containing this room 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score, v);}    
   
    
  //*--------------*
  //* Feature: CorrectAnswer

  /** getter for CorrectAnswer - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCorrectAnswer() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_CorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("CorrectAnswer", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_CorrectAnswer);}
    
  /** setter for CorrectAnswer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrectAnswer(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_CorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("CorrectAnswer", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_CorrectAnswer, v);}    
  }

    