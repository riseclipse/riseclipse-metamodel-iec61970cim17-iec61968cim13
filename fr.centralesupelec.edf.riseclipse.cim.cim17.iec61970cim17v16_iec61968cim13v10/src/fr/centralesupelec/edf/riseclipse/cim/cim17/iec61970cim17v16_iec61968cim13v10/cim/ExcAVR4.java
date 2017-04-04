/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exc AVR4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getImul <em>Imul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKif <em>Kif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1if <em>T1if</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getTif <em>Tif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmn <em>Vfmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmx <em>Vfmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmx <em>Vrmx</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4()
 * @model
 * @generated
 */
public interface ExcAVR4 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Imul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Imul</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imul</em>' attribute.
     * @see #isSetImul()
     * @see #unsetImul()
     * @see #setImul(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Imul()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.imul' kind='element'"
     * @generated
     */
    Boolean getImul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getImul <em>Imul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imul</em>' attribute.
     * @see #isSetImul()
     * @see #unsetImul()
     * @see #getImul()
     * @generated
     */
    void setImul( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getImul <em>Imul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImul()
     * @see #getImul()
     * @see #setImul(Boolean)
     * @generated
     */
    void unsetImul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getImul <em>Imul</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Imul</em>' attribute is set.
     * @see #unsetImul()
     * @see #getImul()
     * @see #setImul(Boolean)
     * @generated
     */
    boolean isSetImul();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ka</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Ka()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.ka' kind='element'"
     * @generated
     */
    Float getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Float)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Float)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ke</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Ke()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.ke' kind='element'"
     * @generated
     */
    Float getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #getKe()
     * @generated
     */
    void setKe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Float)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Float)
     * @generated
     */
    boolean isSetKe();

    /**
     * Returns the value of the '<em><b>Kif</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kif</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kif</em>' attribute.
     * @see #isSetKif()
     * @see #unsetKif()
     * @see #setKif(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Kif()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.kif' kind='element'"
     * @generated
     */
    Float getKif();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKif <em>Kif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kif</em>' attribute.
     * @see #isSetKif()
     * @see #unsetKif()
     * @see #getKif()
     * @generated
     */
    void setKif( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKif <em>Kif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKif()
     * @see #getKif()
     * @see #setKif(Float)
     * @generated
     */
    void unsetKif();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getKif <em>Kif</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kif</em>' attribute is set.
     * @see #unsetKif()
     * @see #getKif()
     * @see #setKif(Float)
     * @generated
     */
    boolean isSetKif();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_T1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.t1' kind='element'"
     * @generated
     */
    Float getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>T1if</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1if</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1if</em>' attribute.
     * @see #isSetT1if()
     * @see #unsetT1if()
     * @see #setT1if(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_T1if()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.t1if' kind='element'"
     * @generated
     */
    Float getT1if();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1if <em>T1if</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1if</em>' attribute.
     * @see #isSetT1if()
     * @see #unsetT1if()
     * @see #getT1if()
     * @generated
     */
    void setT1if( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1if <em>T1if</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1if()
     * @see #getT1if()
     * @see #setT1if(Float)
     * @generated
     */
    void unsetT1if();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT1if <em>T1if</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1if</em>' attribute is set.
     * @see #unsetT1if()
     * @see #getT1if()
     * @see #setT1if(Float)
     * @generated
     */
    boolean isSetT1if();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_T2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.t2' kind='element'"
     * @generated
     */
    Float getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_T3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.t3' kind='element'"
     * @generated
     */
    Float getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_T4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.t4' kind='element'"
     * @generated
     */
    Float getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #getT4()
     * @generated
     */
    void setT4( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Float)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getT4 <em>T4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4</em>' attribute is set.
     * @see #unsetT4()
     * @see #getT4()
     * @see #setT4(Float)
     * @generated
     */
    boolean isSetT4();

    /**
     * Returns the value of the '<em><b>Tif</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tif</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tif</em>' attribute.
     * @see #isSetTif()
     * @see #unsetTif()
     * @see #setTif(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Tif()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.tif' kind='element'"
     * @generated
     */
    Float getTif();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getTif <em>Tif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tif</em>' attribute.
     * @see #isSetTif()
     * @see #unsetTif()
     * @see #getTif()
     * @generated
     */
    void setTif( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getTif <em>Tif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTif()
     * @see #getTif()
     * @see #setTif(Float)
     * @generated
     */
    void unsetTif();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getTif <em>Tif</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tif</em>' attribute is set.
     * @see #unsetTif()
     * @see #getTif()
     * @see #setTif(Float)
     * @generated
     */
    boolean isSetTif();

    /**
     * Returns the value of the '<em><b>Vfmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vfmn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vfmn</em>' attribute.
     * @see #isSetVfmn()
     * @see #unsetVfmn()
     * @see #setVfmn(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Vfmn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.vfmn' kind='element'"
     * @generated
     */
    Float getVfmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmn <em>Vfmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vfmn</em>' attribute.
     * @see #isSetVfmn()
     * @see #unsetVfmn()
     * @see #getVfmn()
     * @generated
     */
    void setVfmn( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmn <em>Vfmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVfmn()
     * @see #getVfmn()
     * @see #setVfmn(Float)
     * @generated
     */
    void unsetVfmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmn <em>Vfmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vfmn</em>' attribute is set.
     * @see #unsetVfmn()
     * @see #getVfmn()
     * @see #setVfmn(Float)
     * @generated
     */
    boolean isSetVfmn();

    /**
     * Returns the value of the '<em><b>Vfmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vfmx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vfmx</em>' attribute.
     * @see #isSetVfmx()
     * @see #unsetVfmx()
     * @see #setVfmx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Vfmx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.vfmx' kind='element'"
     * @generated
     */
    Float getVfmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmx <em>Vfmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vfmx</em>' attribute.
     * @see #isSetVfmx()
     * @see #unsetVfmx()
     * @see #getVfmx()
     * @generated
     */
    void setVfmx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmx <em>Vfmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVfmx()
     * @see #getVfmx()
     * @see #setVfmx(Float)
     * @generated
     */
    void unsetVfmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVfmx <em>Vfmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vfmx</em>' attribute is set.
     * @see #unsetVfmx()
     * @see #getVfmx()
     * @see #setVfmx(Float)
     * @generated
     */
    boolean isSetVfmx();

    /**
     * Returns the value of the '<em><b>Vrmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vrmn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vrmn</em>' attribute.
     * @see #isSetVrmn()
     * @see #unsetVrmn()
     * @see #setVrmn(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Vrmn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.vrmn' kind='element'"
     * @generated
     */
    Float getVrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmn</em>' attribute.
     * @see #isSetVrmn()
     * @see #unsetVrmn()
     * @see #getVrmn()
     * @generated
     */
    void setVrmn( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Float)
     * @generated
     */
    void unsetVrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmn <em>Vrmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmn</em>' attribute is set.
     * @see #unsetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Float)
     * @generated
     */
    boolean isSetVrmn();

    /**
     * Returns the value of the '<em><b>Vrmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vrmx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vrmx</em>' attribute.
     * @see #isSetVrmx()
     * @see #unsetVrmx()
     * @see #setVrmx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcAVR4_Vrmx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcAVR4.vrmx' kind='element'"
     * @generated
     */
    Float getVrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmx</em>' attribute.
     * @see #isSetVrmx()
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @generated
     */
    void setVrmx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Float)
     * @generated
     */
    void unsetVrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4#getVrmx <em>Vrmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmx</em>' attribute is set.
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Float)
     * @generated
     */
    boolean isSetVrmx();

} // ExcAVR4
