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
 * A representation of the model object '<em><b>Exc ANS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getBlint <em>Blint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmn <em>Ifmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmx <em>Ifmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKce <em>Kce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKrvecc <em>Krvecc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKvfif <em>Kvfif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmx <em>Vrmx</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS()
 * @model
 * @generated
 */
public interface ExcANS extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Blint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blint</em>' attribute.
     * @see #isSetBlint()
     * @see #unsetBlint()
     * @see #setBlint(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Blint()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.blint' kind='element'"
     * @generated
     */
    Integer getBlint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getBlint <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blint</em>' attribute.
     * @see #isSetBlint()
     * @see #unsetBlint()
     * @see #getBlint()
     * @generated
     */
    void setBlint( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getBlint <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBlint()
     * @see #getBlint()
     * @see #setBlint(Integer)
     * @generated
     */
    void unsetBlint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getBlint <em>Blint</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Blint</em>' attribute is set.
     * @see #unsetBlint()
     * @see #getBlint()
     * @see #setBlint(Integer)
     * @generated
     */
    boolean isSetBlint();

    /**
     * Returns the value of the '<em><b>Ifmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifmn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifmn</em>' attribute.
     * @see #isSetIfmn()
     * @see #unsetIfmn()
     * @see #setIfmn(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Ifmn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.ifmn' kind='element'"
     * @generated
     */
    Float getIfmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifmn</em>' attribute.
     * @see #isSetIfmn()
     * @see #unsetIfmn()
     * @see #getIfmn()
     * @generated
     */
    void setIfmn( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfmn()
     * @see #getIfmn()
     * @see #setIfmn(Float)
     * @generated
     */
    void unsetIfmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifmn</em>' attribute is set.
     * @see #unsetIfmn()
     * @see #getIfmn()
     * @see #setIfmn(Float)
     * @generated
     */
    boolean isSetIfmn();

    /**
     * Returns the value of the '<em><b>Ifmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifmx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifmx</em>' attribute.
     * @see #isSetIfmx()
     * @see #unsetIfmx()
     * @see #setIfmx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Ifmx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.ifmx' kind='element'"
     * @generated
     */
    Float getIfmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifmx</em>' attribute.
     * @see #isSetIfmx()
     * @see #unsetIfmx()
     * @see #getIfmx()
     * @generated
     */
    void setIfmx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfmx()
     * @see #getIfmx()
     * @see #setIfmx(Float)
     * @generated
     */
    void unsetIfmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifmx</em>' attribute is set.
     * @see #unsetIfmx()
     * @see #getIfmx()
     * @see #setIfmx(Float)
     * @generated
     */
    boolean isSetIfmx();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>K2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_K2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.k2' kind='element'"
     * @generated
     */
    Float getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #getK2()
     * @generated
     */
    void setK2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Float)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK2 <em>K2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K2</em>' attribute is set.
     * @see #unsetK2()
     * @see #getK2()
     * @see #setK2(Float)
     * @generated
     */
    boolean isSetK2();

    /**
     * Returns the value of the '<em><b>K3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>K3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #setK3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_K3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.k3' kind='element'"
     * @generated
     */
    Float getK3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #getK3()
     * @generated
     */
    void setK3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK3()
     * @see #getK3()
     * @see #setK3(Float)
     * @generated
     */
    void unsetK3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getK3 <em>K3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K3</em>' attribute is set.
     * @see #unsetK3()
     * @see #getK3()
     * @see #setK3(Float)
     * @generated
     */
    boolean isSetK3();

    /**
     * Returns the value of the '<em><b>Kce</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kce</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #setKce(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Kce()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.kce' kind='element'"
     * @generated
     */
    Float getKce();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #getKce()
     * @generated
     */
    void setKce( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKce()
     * @see #getKce()
     * @see #setKce(Float)
     * @generated
     */
    void unsetKce();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKce <em>Kce</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kce</em>' attribute is set.
     * @see #unsetKce()
     * @see #getKce()
     * @see #setKce(Float)
     * @generated
     */
    boolean isSetKce();

    /**
     * Returns the value of the '<em><b>Krvecc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Krvecc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Krvecc</em>' attribute.
     * @see #isSetKrvecc()
     * @see #unsetKrvecc()
     * @see #setKrvecc(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Krvecc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.krvecc' kind='element'"
     * @generated
     */
    Integer getKrvecc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Krvecc</em>' attribute.
     * @see #isSetKrvecc()
     * @see #unsetKrvecc()
     * @see #getKrvecc()
     * @generated
     */
    void setKrvecc( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKrvecc()
     * @see #getKrvecc()
     * @see #setKrvecc(Integer)
     * @generated
     */
    void unsetKrvecc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Krvecc</em>' attribute is set.
     * @see #unsetKrvecc()
     * @see #getKrvecc()
     * @see #setKrvecc(Integer)
     * @generated
     */
    boolean isSetKrvecc();

    /**
     * Returns the value of the '<em><b>Kvfif</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kvfif</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kvfif</em>' attribute.
     * @see #isSetKvfif()
     * @see #unsetKvfif()
     * @see #setKvfif(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Kvfif()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.kvfif' kind='element'"
     * @generated
     */
    Integer getKvfif();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kvfif</em>' attribute.
     * @see #isSetKvfif()
     * @see #unsetKvfif()
     * @see #getKvfif()
     * @generated
     */
    void setKvfif( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKvfif()
     * @see #getKvfif()
     * @see #setKvfif(Integer)
     * @generated
     */
    void unsetKvfif();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kvfif</em>' attribute is set.
     * @see #unsetKvfif()
     * @see #getKvfif()
     * @see #setKvfif(Integer)
     * @generated
     */
    boolean isSetKvfif();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_T1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.t1' kind='element'"
     * @generated
     */
    Float getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT1 <em>T1</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_T2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.t2' kind='element'"
     * @generated
     */
    Float getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT2 <em>T2</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_T3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.t3' kind='element'"
     * @generated
     */
    Float getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getT3 <em>T3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Tb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.tb' kind='element'"
     * @generated
     */
    Float getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    boolean isSetTb();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Vrmn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.vrmn' kind='element'"
     * @generated
     */
    Float getVrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Float)
     * @generated
     */
    void unsetVrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcANS_Vrmx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcANS.vrmx' kind='element'"
     * @generated
     */
    Float getVrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Float)
     * @generated
     */
    void unsetVrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmx</em>' attribute is set.
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Float)
     * @generated
     */
    boolean isSetVrmx();

} // ExcANS
