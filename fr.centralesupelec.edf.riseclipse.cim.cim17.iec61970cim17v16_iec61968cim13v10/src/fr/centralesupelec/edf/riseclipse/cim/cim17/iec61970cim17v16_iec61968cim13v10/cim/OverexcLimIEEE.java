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
 * A representation of the model object '<em><b>Overexc Lim IEEE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE()
 * @model
 * @generated
 */
public interface OverexcLimIEEE extends OverexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Hyst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hyst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hyst</em>' attribute.
     * @see #isSetHyst()
     * @see #unsetHyst()
     * @see #setHyst(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Hyst()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.hyst' kind='element'"
     * @generated
     */
    Float getHyst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hyst</em>' attribute.
     * @see #isSetHyst()
     * @see #unsetHyst()
     * @see #getHyst()
     * @generated
     */
    void setHyst( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHyst()
     * @see #getHyst()
     * @see #setHyst(Float)
     * @generated
     */
    void unsetHyst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hyst</em>' attribute is set.
     * @see #unsetHyst()
     * @see #getHyst()
     * @see #setHyst(Float)
     * @generated
     */
    boolean isSetHyst();

    /**
     * Returns the value of the '<em><b>Ifdlim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifdlim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #setIfdlim(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Ifdlim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.ifdlim' kind='element'"
     * @generated
     */
    Float getIfdlim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @generated
     */
    void setIfdlim( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Float)
     * @generated
     */
    void unsetIfdlim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifdlim</em>' attribute is set.
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Float)
     * @generated
     */
    boolean isSetIfdlim();

    /**
     * Returns the value of the '<em><b>Ifdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifdmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifdmax</em>' attribute.
     * @see #isSetIfdmax()
     * @see #unsetIfdmax()
     * @see #setIfdmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Ifdmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.ifdmax' kind='element'"
     * @generated
     */
    Float getIfdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifdmax</em>' attribute.
     * @see #isSetIfdmax()
     * @see #unsetIfdmax()
     * @see #getIfdmax()
     * @generated
     */
    void setIfdmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdmax()
     * @see #getIfdmax()
     * @see #setIfdmax(Float)
     * @generated
     */
    void unsetIfdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifdmax</em>' attribute is set.
     * @see #unsetIfdmax()
     * @see #getIfdmax()
     * @see #setIfdmax(Float)
     * @generated
     */
    boolean isSetIfdmax();

    /**
     * Returns the value of the '<em><b>Itfpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Itfpu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Itfpu</em>' attribute.
     * @see #isSetItfpu()
     * @see #unsetItfpu()
     * @see #setItfpu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Itfpu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.itfpu' kind='element'"
     * @generated
     */
    Float getItfpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Itfpu</em>' attribute.
     * @see #isSetItfpu()
     * @see #unsetItfpu()
     * @see #getItfpu()
     * @generated
     */
    void setItfpu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetItfpu()
     * @see #getItfpu()
     * @see #setItfpu(Float)
     * @generated
     */
    void unsetItfpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Itfpu</em>' attribute is set.
     * @see #unsetItfpu()
     * @see #getItfpu()
     * @see #setItfpu(Float)
     * @generated
     */
    boolean isSetItfpu();

    /**
     * Returns the value of the '<em><b>Kcd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kcd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kcd</em>' attribute.
     * @see #isSetKcd()
     * @see #unsetKcd()
     * @see #setKcd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Kcd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.kcd' kind='element'"
     * @generated
     */
    Float getKcd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kcd</em>' attribute.
     * @see #isSetKcd()
     * @see #unsetKcd()
     * @see #getKcd()
     * @generated
     */
    void setKcd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKcd()
     * @see #getKcd()
     * @see #setKcd(Float)
     * @generated
     */
    void unsetKcd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kcd</em>' attribute is set.
     * @see #unsetKcd()
     * @see #getKcd()
     * @see #setKcd(Float)
     * @generated
     */
    boolean isSetKcd();

    /**
     * Returns the value of the '<em><b>Kramp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kramp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kramp</em>' attribute.
     * @see #isSetKramp()
     * @see #unsetKramp()
     * @see #setKramp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLimIEEE_Kramp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLimIEEE.kramp' kind='element'"
     * @generated
     */
    Float getKramp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kramp</em>' attribute.
     * @see #isSetKramp()
     * @see #unsetKramp()
     * @see #getKramp()
     * @generated
     */
    void setKramp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKramp()
     * @see #getKramp()
     * @see #setKramp(Float)
     * @generated
     */
    void unsetKramp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kramp</em>' attribute is set.
     * @see #unsetKramp()
     * @see #getKramp()
     * @see #setKramp(Float)
     * @generated
     */
    boolean isSetKramp();

} // OverexcLimIEEE
