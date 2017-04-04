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
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC2A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC2A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Td1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Td1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Td1</em>' attribute.
     * @see #isSetTd1()
     * @see #unsetTd1()
     * @see #setTd1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A_Td1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC2A.td1' kind='element'"
     * @generated
     */
    Float getTd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td1</em>' attribute.
     * @see #isSetTd1()
     * @see #unsetTd1()
     * @see #getTd1()
     * @generated
     */
    void setTd1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd1()
     * @see #getTd1()
     * @see #setTd1(Float)
     * @generated
     */
    void unsetTd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td1</em>' attribute is set.
     * @see #unsetTd1()
     * @see #getTd1()
     * @see #setTd1(Float)
     * @generated
     */
    boolean isSetTd1();

    /**
     * Returns the value of the '<em><b>Td2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Td2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Td2</em>' attribute.
     * @see #isSetTd2()
     * @see #unsetTd2()
     * @see #setTd2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A_Td2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC2A.td2' kind='element'"
     * @generated
     */
    Float getTd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td2</em>' attribute.
     * @see #isSetTd2()
     * @see #unsetTd2()
     * @see #getTd2()
     * @generated
     */
    void setTd2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd2()
     * @see #getTd2()
     * @see #setTd2(Float)
     * @generated
     */
    void unsetTd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td2</em>' attribute is set.
     * @see #unsetTd2()
     * @see #getTd2()
     * @see #setTd2(Float)
     * @generated
     */
    boolean isSetTd2();

    /**
     * Returns the value of the '<em><b>Vdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vdmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vdmax</em>' attribute.
     * @see #isSetVdmax()
     * @see #unsetVdmax()
     * @see #setVdmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A_Vdmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC2A.vdmax' kind='element'"
     * @generated
     */
    Float getVdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vdmax</em>' attribute.
     * @see #isSetVdmax()
     * @see #unsetVdmax()
     * @see #getVdmax()
     * @generated
     */
    void setVdmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVdmax()
     * @see #getVdmax()
     * @see #setVdmax(Float)
     * @generated
     */
    void unsetVdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vdmax</em>' attribute is set.
     * @see #unsetVdmax()
     * @see #getVdmax()
     * @see #setVdmax(Float)
     * @generated
     */
    boolean isSetVdmax();

    /**
     * Returns the value of the '<em><b>Vdmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vdmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vdmin</em>' attribute.
     * @see #isSetVdmin()
     * @see #unsetVdmin()
     * @see #setVdmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A_Vdmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC2A.vdmin' kind='element'"
     * @generated
     */
    Float getVdmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vdmin</em>' attribute.
     * @see #isSetVdmin()
     * @see #unsetVdmin()
     * @see #getVdmin()
     * @generated
     */
    void setVdmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVdmin()
     * @see #getVdmin()
     * @see #setVdmin(Float)
     * @generated
     */
    void unsetVdmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vdmin</em>' attribute is set.
     * @see #unsetVdmin()
     * @see #getVdmin()
     * @see #setVdmin(Float)
     * @generated
     */
    boolean isSetVdmin();

    /**
     * Returns the value of the '<em><b>Vk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vk</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vk</em>' attribute.
     * @see #isSetVk()
     * @see #unsetVk()
     * @see #setVk(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC2A_Vk()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC2A.vk' kind='element'"
     * @generated
     */
    Float getVk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vk</em>' attribute.
     * @see #isSetVk()
     * @see #unsetVk()
     * @see #getVk()
     * @generated
     */
    void setVk( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVk()
     * @see #getVk()
     * @see #setVk(Float)
     * @generated
     */
    void unsetVk();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vk</em>' attribute is set.
     * @see #unsetVk()
     * @see #getVk()
     * @see #setVk(Float)
     * @generated
     */
    boolean isSetVk();

} // DiscExcContIEEEDEC2A
