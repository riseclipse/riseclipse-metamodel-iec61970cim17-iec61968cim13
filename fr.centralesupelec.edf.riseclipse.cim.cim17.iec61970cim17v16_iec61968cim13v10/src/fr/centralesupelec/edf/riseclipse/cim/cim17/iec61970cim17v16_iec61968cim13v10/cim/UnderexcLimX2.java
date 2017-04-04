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
 * A representation of the model object '<em><b>Underexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getQo <em>Qo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTm <em>Tm</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2()
 * @model
 * @generated
 */
public interface UnderexcLimX2 extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Kf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kf2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kf2</em>' attribute.
     * @see #isSetKf2()
     * @see #unsetKf2()
     * @see #setKf2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Kf2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.kf2' kind='element'"
     * @generated
     */
    Float getKf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf2</em>' attribute.
     * @see #isSetKf2()
     * @see #unsetKf2()
     * @see #getKf2()
     * @generated
     */
    void setKf2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf2()
     * @see #getKf2()
     * @see #setKf2(Float)
     * @generated
     */
    void unsetKf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf2</em>' attribute is set.
     * @see #unsetKf2()
     * @see #getKf2()
     * @see #setKf2(Float)
     * @generated
     */
    boolean isSetKf2();

    /**
     * Returns the value of the '<em><b>Km</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Km</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Km</em>' attribute.
     * @see #isSetKm()
     * @see #unsetKm()
     * @see #setKm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Km()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.km' kind='element'"
     * @generated
     */
    Float getKm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Km</em>' attribute.
     * @see #isSetKm()
     * @see #unsetKm()
     * @see #getKm()
     * @generated
     */
    void setKm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKm()
     * @see #getKm()
     * @see #setKm(Float)
     * @generated
     */
    void unsetKm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Km</em>' attribute is set.
     * @see #unsetKm()
     * @see #getKm()
     * @see #setKm(Float)
     * @generated
     */
    boolean isSetKm();

    /**
     * Returns the value of the '<em><b>Melmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Melmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Melmax</em>' attribute.
     * @see #isSetMelmax()
     * @see #unsetMelmax()
     * @see #setMelmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Melmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.melmax' kind='element'"
     * @generated
     */
    Float getMelmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Melmax</em>' attribute.
     * @see #isSetMelmax()
     * @see #unsetMelmax()
     * @see #getMelmax()
     * @generated
     */
    void setMelmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Float)
     * @generated
     */
    void unsetMelmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Melmax</em>' attribute is set.
     * @see #unsetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Float)
     * @generated
     */
    boolean isSetMelmax();

    /**
     * Returns the value of the '<em><b>Qo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qo</em>' attribute.
     * @see #isSetQo()
     * @see #unsetQo()
     * @see #setQo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Qo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.qo' kind='element'"
     * @generated
     */
    Float getQo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qo</em>' attribute.
     * @see #isSetQo()
     * @see #unsetQo()
     * @see #getQo()
     * @generated
     */
    void setQo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQo()
     * @see #getQo()
     * @see #setQo(Float)
     * @generated
     */
    void unsetQo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qo</em>' attribute is set.
     * @see #unsetQo()
     * @see #getQo()
     * @see #setQo(Float)
     * @generated
     */
    boolean isSetQo();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>Tf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tf2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #setTf2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Tf2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.tf2' kind='element'"
     * @generated
     */
    Float getTf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #getTf2()
     * @generated
     */
    void setTf2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf2()
     * @see #getTf2()
     * @see #setTf2(Float)
     * @generated
     */
    void unsetTf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf2</em>' attribute is set.
     * @see #unsetTf2()
     * @see #getTf2()
     * @see #setTf2(Float)
     * @generated
     */
    boolean isSetTf2();

    /**
     * Returns the value of the '<em><b>Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #setTm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimX2_Tm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimX2.tm' kind='element'"
     * @generated
     */
    Float getTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #getTm()
     * @generated
     */
    void setTm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTm()
     * @see #getTm()
     * @see #setTm(Float)
     * @generated
     */
    void unsetTm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tm</em>' attribute is set.
     * @see #unsetTm()
     * @see #getTm()
     * @see #setTm(Float)
     * @generated
     */
    boolean isSetTm();

} // UnderexcLimX2
