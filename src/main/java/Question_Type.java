
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
public class Question_Type extends Sentence_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Question");



  /** @generated */
  final Feature casFeat_Answers;
  /** @generated */
  final int     casFeatCode_Answers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Answers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_Answers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Answers = jcas.getRequiredFeatureDE(casType, "Answers", "Answer", featOkTst);
    casFeatCode_Answers  = (null == casFeat_Answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Answers).getCode();

  }
}



    