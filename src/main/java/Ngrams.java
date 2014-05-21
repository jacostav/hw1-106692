

/* First created by JCasGen Fri Feb 14 21:02:56 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Feb 15 12:39:56 CST 2014
 * XML source: C:/Users/George/Desktop/eclipse/projectos/hw1-ID/src/main/resources/hw1-106692-typesystem.xml
 * @generated */
public class Ngrams extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngrams.class);
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
  protected Ngrams() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Ngrams(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Ngrams(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Ngrams(JCas jcas, int begin, int end) {
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
  //* Feature: Tokens

  /** getter for Tokens - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokens() {
    if (Ngrams_Type.featOkTst && ((Ngrams_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "Ngrams");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngrams_Type)jcasType).casFeatCode_Tokens);}
    
  /** setter for Tokens - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(int v) {
    if (Ngrams_Type.featOkTst && ((Ngrams_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "Ngrams");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngrams_Type)jcasType).casFeatCode_Tokens, v);}    
   
    
  //*--------------*
  //* Feature: PrecisionN

  /** getter for PrecisionN - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getPrecisionN() {
    if (Ngrams_Type.featOkTst && ((Ngrams_Type)jcasType).casFeat_PrecisionN == null)
      jcasType.jcas.throwFeatMissing("PrecisionN", "Ngrams");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Ngrams_Type)jcasType).casFeatCode_PrecisionN);}
    
  /** setter for PrecisionN - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionN(boolean v) {
    if (Ngrams_Type.featOkTst && ((Ngrams_Type)jcasType).casFeat_PrecisionN == null)
      jcasType.jcas.throwFeatMissing("PrecisionN", "Ngrams");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Ngrams_Type)jcasType).casFeatCode_PrecisionN, v);}    
  }

    