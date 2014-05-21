
/* First created by JCasGen Fri Feb 14 19:43:15 CST 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sat Feb 15 12:39:56 CST 2014
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");



  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_CorrectAnswer;
  /** @generated */
  final int     casFeatCode_CorrectAnswer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCorrectAnswer(int addr) {
        if (featOkTst && casFeat_CorrectAnswer == null)
      jcas.throwFeatMissing("CorrectAnswer", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_CorrectAnswer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorrectAnswer(int addr, boolean v) {
        if (featOkTst && casFeat_CorrectAnswer == null)
      jcas.throwFeatMissing("CorrectAnswer", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_CorrectAnswer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Double", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

 
    casFeat_CorrectAnswer = jcas.getRequiredFeatureDE(casType, "CorrectAnswer", "uima.cas.Boolean", featOkTst);
    casFeatCode_CorrectAnswer  = (null == casFeat_CorrectAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_CorrectAnswer).getCode();

  }
}



    