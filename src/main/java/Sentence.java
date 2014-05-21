

/* First created by JCasGen Fri Feb 14 20:56:38 CST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Feb 15 12:39:56 CST 2014
 * XML source: C:/Users/George/Desktop/eclipse/projectos/hw1-ID/src/main/resources/hw1-106692-typesystem.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: Ngrams

  /** getter for Ngrams - gets Building containing this room
   * @generated
   * @return value of the feature 
   */
  public Ngrams getNgrams() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Ngrams == null)
      jcasType.jcas.throwFeatMissing("Ngrams", "Sentence");
    return (Ngrams)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Ngrams)));}
    
  /** setter for Ngrams - sets Building containing this room 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(Ngrams v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Ngrams == null)
      jcasType.jcas.throwFeatMissing("Ngrams", "Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    