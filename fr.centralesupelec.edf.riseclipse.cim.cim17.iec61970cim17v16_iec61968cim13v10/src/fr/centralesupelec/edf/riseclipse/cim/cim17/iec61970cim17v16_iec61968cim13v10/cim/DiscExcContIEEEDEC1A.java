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
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC1A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC1A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Esc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Esc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Esc</em>' attribute.
     * @see #isSetEsc()
     * @see #unsetEsc()
     * @see #setEsc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Esc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.esc' kind='element'"
     * @generated
     */
    Float getEsc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Esc</em>' attribute.
     * @see #isSetEsc()
     * @see #unsetEsc()
     * @see #getEsc()
     * @generated
     */
    void setEsc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEsc()
     * @see #getEsc()
     * @see #setEsc(Float)
     * @generated
     */
    void unsetEsc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Esc</em>' attribute is set.
     * @see #unsetEsc()
     * @see #getEsc()
     * @see #setEsc(Float)
     * @generated
     */
    boolean isSetEsc();

    /**
     * Returns the value of the '<em><b>Kan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kan</em>' attribute.
     * @see #isSetKan()
     * @see #unsetKan()
     * @see #setKan(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Kan()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.kan' kind='element'"
     * @generated
     */
    Float getKan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kan</em>' attribute.
     * @see #isSetKan()
     * @see #unsetKan()
     * @see #getKan()
     * @generated
     */
    void setKan( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKan()
     * @see #getKan()
     * @see #setKan(Float)
     * @generated
     */
    void unsetKan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kan</em>' attribute is set.
     * @see #unsetKan()
     * @see #getKan()
     * @see #setKan(Float)
     * @generated
     */
    boolean isSetKan();

    /**
     * Returns the value of the '<em><b>Ketl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ketl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ketl</em>' attribute.
     * @see #isSetKetl()
     * @see #unsetKetl()
     * @see #setKetl(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Ketl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.ketl' kind='element'"
     * @generated
     */
    Float getKetl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ketl</em>' attribute.
     * @see #isSetKetl()
     * @see #unsetKetl()
     * @see #getKetl()
     * @generated
     */
    void setKetl( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKetl()
     * @see #getKetl()
     * @see #setKetl(Float)
     * @generated
     */
    void unsetKetl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ketl</em>' attribute is set.
     * @see #unsetKetl()
     * @see #getKetl()
     * @see #setKetl(Float)
     * @generated
     */
    boolean isSetKetl();

    /**
     * Returns the value of the '<em><b>Tan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tan</em>' attribute.
     * @see #isSetTan()
     * @see #unsetTan()
     * @see #setTan(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Tan()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.tan' kind='element'"
     * @generated
     */
    Float getTan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tan</em>' attribute.
     * @see #isSetTan()
     * @see #unsetTan()
     * @see #getTan()
     * @generated
     */
    void setTan( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTan()
     * @see #getTan()
     * @see #setTan(Float)
     * @generated
     */
    void unsetTan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tan</em>' attribute is set.
     * @see #unsetTan()
     * @see #getTan()
     * @see #setTan(Float)
     * @generated
     */
    boolean isSetTan();

    /**
     * Returns the value of the '<em><b>Td</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Td</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #setTd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Td()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.td' kind='element'"
     * @generated
     */
    Float getTd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #getTd()
     * @generated
     */
    void setTd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd()
     * @see #getTd()
     * @see #setTd(Float)
     * @generated
     */
    void unsetTd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td</em>' attribute is set.
     * @see #unsetTd()
     * @see #getTd()
     * @see #setTd(Float)
     * @generated
     */
    boolean isSetTd();

    /**
     * Returns the value of the '<em><b>Tl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tl1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #setTl1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Tl1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.tl1' kind='element'"
     * @generated
     */
    Float getTl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #getTl1()
     * @generated
     */
    void setTl1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl1()
     * @see #getTl1()
     * @see #setTl1(Float)
     * @generated
     */
    void unsetTl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl1</em>' attribute is set.
     * @see #unsetTl1()
     * @see #getTl1()
     * @see #setTl1(Float)
     * @generated
     */
    boolean isSetTl1();

    /**
     * Returns the value of the '<em><b>Tl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tl2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #setTl2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Tl2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.tl2' kind='element'"
     * @generated
     */
    Float getTl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #getTl2()
     * @generated
     */
    void setTl2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl2()
     * @see #getTl2()
     * @see #setTl2(Float)
     * @generated
     */
    void unsetTl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl2</em>' attribute is set.
     * @see #unsetTl2()
     * @see #getTl2()
     * @see #setTl2(Float)
     * @generated
     */
    boolean isSetTl2();

    /**
     * Returns the value of the '<em><b>Tw5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tw5</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tw5</em>' attribute.
     * @see #isSetTw5()
     * @see #unsetTw5()
     * @see #setTw5(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Tw5()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.tw5' kind='element'"
     * @generated
     */
    Float getTw5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw5</em>' attribute.
     * @see #isSetTw5()
     * @see #unsetTw5()
     * @see #getTw5()
     * @generated
     */
    void setTw5( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw5()
     * @see #getTw5()
     * @see #setTw5(Float)
     * @generated
     */
    void unsetTw5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw5</em>' attribute is set.
     * @see #unsetTw5()
     * @see #getTw5()
     * @see #setTw5(Float)
     * @generated
     */
    boolean isSetTw5();

    /**
     * Returns the value of the '<em><b>Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val</em>' attribute.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see #setVal(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Val()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.val' kind='element'"
     * @generated
     */
    Float getVal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val</em>' attribute.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see #getVal()
     * @generated
     */
    void setVal( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVal()
     * @see #getVal()
     * @see #setVal(Float)
     * @generated
     */
    void unsetVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val</em>' attribute is set.
     * @see #unsetVal()
     * @see #getVal()
     * @see #setVal(Float)
     * @generated
     */
    boolean isSetVal();

    /**
     * Returns the value of the '<em><b>Vanmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vanmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vanmax</em>' attribute.
     * @see #isSetVanmax()
     * @see #unsetVanmax()
     * @see #setVanmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vanmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vanmax' kind='element'"
     * @generated
     */
    Float getVanmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vanmax</em>' attribute.
     * @see #isSetVanmax()
     * @see #unsetVanmax()
     * @see #getVanmax()
     * @generated
     */
    void setVanmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVanmax()
     * @see #getVanmax()
     * @see #setVanmax(Float)
     * @generated
     */
    void unsetVanmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vanmax</em>' attribute is set.
     * @see #unsetVanmax()
     * @see #getVanmax()
     * @see #setVanmax(Float)
     * @generated
     */
    boolean isSetVanmax();

    /**
     * Returns the value of the '<em><b>Vomax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vomax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vomax</em>' attribute.
     * @see #isSetVomax()
     * @see #unsetVomax()
     * @see #setVomax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vomax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vomax' kind='element'"
     * @generated
     */
    Float getVomax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vomax</em>' attribute.
     * @see #isSetVomax()
     * @see #unsetVomax()
     * @see #getVomax()
     * @generated
     */
    void setVomax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVomax()
     * @see #getVomax()
     * @see #setVomax(Float)
     * @generated
     */
    void unsetVomax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vomax</em>' attribute is set.
     * @see #unsetVomax()
     * @see #getVomax()
     * @see #setVomax(Float)
     * @generated
     */
    boolean isSetVomax();

    /**
     * Returns the value of the '<em><b>Vomin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vomin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vomin</em>' attribute.
     * @see #isSetVomin()
     * @see #unsetVomin()
     * @see #setVomin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vomin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vomin' kind='element'"
     * @generated
     */
    Float getVomin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vomin</em>' attribute.
     * @see #isSetVomin()
     * @see #unsetVomin()
     * @see #getVomin()
     * @generated
     */
    void setVomin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVomin()
     * @see #getVomin()
     * @see #setVomin(Float)
     * @generated
     */
    void unsetVomin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vomin</em>' attribute is set.
     * @see #unsetVomin()
     * @see #getVomin()
     * @see #setVomin(Float)
     * @generated
     */
    boolean isSetVomin();

    /**
     * Returns the value of the '<em><b>Vsmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vsmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vsmax</em>' attribute.
     * @see #isSetVsmax()
     * @see #unsetVsmax()
     * @see #setVsmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vsmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vsmax' kind='element'"
     * @generated
     */
    Float getVsmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmax</em>' attribute.
     * @see #isSetVsmax()
     * @see #unsetVsmax()
     * @see #getVsmax()
     * @generated
     */
    void setVsmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmax()
     * @see #getVsmax()
     * @see #setVsmax(Float)
     * @generated
     */
    void unsetVsmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmax</em>' attribute is set.
     * @see #unsetVsmax()
     * @see #getVsmax()
     * @see #setVsmax(Float)
     * @generated
     */
    boolean isSetVsmax();

    /**
     * Returns the value of the '<em><b>Vsmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vsmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vsmin</em>' attribute.
     * @see #isSetVsmin()
     * @see #unsetVsmin()
     * @see #setVsmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vsmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vsmin' kind='element'"
     * @generated
     */
    Float getVsmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmin</em>' attribute.
     * @see #isSetVsmin()
     * @see #unsetVsmin()
     * @see #getVsmin()
     * @generated
     */
    void setVsmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmin()
     * @see #getVsmin()
     * @see #setVsmin(Float)
     * @generated
     */
    void unsetVsmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmin</em>' attribute is set.
     * @see #unsetVsmin()
     * @see #getVsmin()
     * @see #setVsmin(Float)
     * @generated
     */
    boolean isSetVsmin();

    /**
     * Returns the value of the '<em><b>Vtc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vtc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vtc</em>' attribute.
     * @see #isSetVtc()
     * @see #unsetVtc()
     * @see #setVtc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vtc' kind='element'"
     * @generated
     */
    Float getVtc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtc</em>' attribute.
     * @see #isSetVtc()
     * @see #unsetVtc()
     * @see #getVtc()
     * @generated
     */
    void setVtc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtc()
     * @see #getVtc()
     * @see #setVtc(Float)
     * @generated
     */
    void unsetVtc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtc</em>' attribute is set.
     * @see #unsetVtc()
     * @see #getVtc()
     * @see #setVtc(Float)
     * @generated
     */
    boolean isSetVtc();

    /**
     * Returns the value of the '<em><b>Vtlmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vtlmt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vtlmt</em>' attribute.
     * @see #isSetVtlmt()
     * @see #unsetVtlmt()
     * @see #setVtlmt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtlmt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vtlmt' kind='element'"
     * @generated
     */
    Float getVtlmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtlmt</em>' attribute.
     * @see #isSetVtlmt()
     * @see #unsetVtlmt()
     * @see #getVtlmt()
     * @generated
     */
    void setVtlmt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtlmt()
     * @see #getVtlmt()
     * @see #setVtlmt(Float)
     * @generated
     */
    void unsetVtlmt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtlmt</em>' attribute is set.
     * @see #unsetVtlmt()
     * @see #getVtlmt()
     * @see #setVtlmt(Float)
     * @generated
     */
    boolean isSetVtlmt();

    /**
     * Returns the value of the '<em><b>Vtm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vtm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vtm</em>' attribute.
     * @see #isSetVtm()
     * @see #unsetVtm()
     * @see #setVtm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vtm' kind='element'"
     * @generated
     */
    Float getVtm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtm</em>' attribute.
     * @see #isSetVtm()
     * @see #unsetVtm()
     * @see #getVtm()
     * @generated
     */
    void setVtm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtm()
     * @see #getVtm()
     * @see #setVtm(Float)
     * @generated
     */
    void unsetVtm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtm</em>' attribute is set.
     * @see #unsetVtm()
     * @see #getVtm()
     * @see #setVtm(Float)
     * @generated
     */
    boolean isSetVtm();

    /**
     * Returns the value of the '<em><b>Vtn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vtn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vtn</em>' attribute.
     * @see #isSetVtn()
     * @see #unsetVtn()
     * @see #setVtn(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC1A.vtn' kind='element'"
     * @generated
     */
    Float getVtn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtn</em>' attribute.
     * @see #isSetVtn()
     * @see #unsetVtn()
     * @see #getVtn()
     * @generated
     */
    void setVtn( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtn()
     * @see #getVtn()
     * @see #setVtn(Float)
     * @generated
     */
    void unsetVtn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtn</em>' attribute is set.
     * @see #unsetVtn()
     * @see #getVtn()
     * @see #setVtn(Float)
     * @generated
     */
    boolean isSetVtn();

} // DiscExcContIEEEDEC1A
