
/* First created by JCasGen Fri Feb 14 21:02:56 CST 2014 */

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
public class Ngrams_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngrams_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngrams_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngrams(addr, Ngrams_Type.this);
  			   Ngrams_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngrams(addr, Ngrams_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngrams.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Ngrams");
 
  /** @generated */
  final Feature casFeat_Tokens;
  /** @generated */
  final int     casFeatCode_Tokens;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "Ngrams");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Tokens);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "Ngrams");
    ll_cas.ll_setIntValue(addr, casFeatCode_Tokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PrecisionN;
  /** @generated */
  final int     casFeatCode_PrecisionN;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getPrecisionN(int addr) {
        if (featOkTst && casFeat_PrecisionN == null)
      jcas.throwFeatMissing("PrecisionN", "Ngrams");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_PrecisionN);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecisionN(int addr, boolean v) {
        if (featOkTst && casFeat_PrecisionN == null)
      jcas.throwFeatMissing("PrecisionN", "Ngrams");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_PrecisionN, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Ngrams_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Tokens = jcas.getRequiredFeatureDE(casType, "Tokens", "uima.cas.Integer", featOkTst);
    casFeatCode_Tokens  = (null == casFeat_Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tokens).getCode();

 
    casFeat_PrecisionN = jcas.getRequiredFeatureDE(casType, "PrecisionN", "uima.cas.Boolean", featOkTst);
    casFeatCode_PrecisionN  = (null == casFeat_PrecisionN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PrecisionN).getCode();

  }
}



    