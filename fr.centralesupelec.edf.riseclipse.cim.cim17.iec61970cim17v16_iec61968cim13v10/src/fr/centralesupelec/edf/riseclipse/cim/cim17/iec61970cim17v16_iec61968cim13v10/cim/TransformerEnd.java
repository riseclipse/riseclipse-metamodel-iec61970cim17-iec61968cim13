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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBmagSat <em>Bmag Sat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagBaseU <em>Mag Base U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRground <em>Rground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getXground <em>Xground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getStarImpedance <em>Star Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd()
 * @model
 * @generated
 */
public interface TransformerEnd extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Bmag Sat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bmag Sat</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bmag Sat</em>' attribute.
     * @see #isSetBmagSat()
     * @see #unsetBmagSat()
     * @see #setBmagSat(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_BmagSat()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.bmagSat' kind='element'"
     * @generated
     */
    Float getBmagSat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bmag Sat</em>' attribute.
     * @see #isSetBmagSat()
     * @see #unsetBmagSat()
     * @see #getBmagSat()
     * @generated
     */
    void setBmagSat( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBmagSat()
     * @see #getBmagSat()
     * @see #setBmagSat(Float)
     * @generated
     */
    void unsetBmagSat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bmag Sat</em>' attribute is set.
     * @see #unsetBmagSat()
     * @see #getBmagSat()
     * @see #setBmagSat(Float)
     * @generated
     */
    boolean isSetBmagSat();

    /**
     * Returns the value of the '<em><b>End Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #setEndNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_EndNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.endNumber' kind='element'"
     * @generated
     */
    Integer getEndNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @generated
     */
    void setEndNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(Integer)
     * @generated
     */
    void unsetEndNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Number</em>' attribute is set.
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(Integer)
     * @generated
     */
    boolean isSetEndNumber();

    /**
     * Returns the value of the '<em><b>Grounded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #setGrounded(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_Grounded()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.grounded' kind='element'"
     * @generated
     */
    Boolean getGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @generated
     */
    void setGrounded( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    void unsetGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded</em>' attribute is set.
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    boolean isSetGrounded();

    /**
     * Returns the value of the '<em><b>Mag Base U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mag Base U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mag Base U</em>' attribute.
     * @see #isSetMagBaseU()
     * @see #unsetMagBaseU()
     * @see #setMagBaseU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_MagBaseU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.magBaseU' kind='element'"
     * @generated
     */
    Float getMagBaseU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mag Base U</em>' attribute.
     * @see #isSetMagBaseU()
     * @see #unsetMagBaseU()
     * @see #getMagBaseU()
     * @generated
     */
    void setMagBaseU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMagBaseU()
     * @see #getMagBaseU()
     * @see #setMagBaseU(Float)
     * @generated
     */
    void unsetMagBaseU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mag Base U</em>' attribute is set.
     * @see #unsetMagBaseU()
     * @see #getMagBaseU()
     * @see #setMagBaseU(Float)
     * @generated
     */
    boolean isSetMagBaseU();

    /**
     * Returns the value of the '<em><b>Mag Sat Flux</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mag Sat Flux</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mag Sat Flux</em>' attribute.
     * @see #isSetMagSatFlux()
     * @see #unsetMagSatFlux()
     * @see #setMagSatFlux(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_MagSatFlux()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.magSatFlux' kind='element'"
     * @generated
     */
    Float getMagSatFlux();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mag Sat Flux</em>' attribute.
     * @see #isSetMagSatFlux()
     * @see #unsetMagSatFlux()
     * @see #getMagSatFlux()
     * @generated
     */
    void setMagSatFlux( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMagSatFlux()
     * @see #getMagSatFlux()
     * @see #setMagSatFlux(Float)
     * @generated
     */
    void unsetMagSatFlux();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mag Sat Flux</em>' attribute is set.
     * @see #unsetMagSatFlux()
     * @see #getMagSatFlux()
     * @see #setMagSatFlux(Float)
     * @generated
     */
    boolean isSetMagSatFlux();

    /**
     * Returns the value of the '<em><b>Rground</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rground</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rground</em>' attribute.
     * @see #isSetRground()
     * @see #unsetRground()
     * @see #setRground(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_Rground()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.rground' kind='element'"
     * @generated
     */
    Float getRground();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRground <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rground</em>' attribute.
     * @see #isSetRground()
     * @see #unsetRground()
     * @see #getRground()
     * @generated
     */
    void setRground( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRground <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRground()
     * @see #getRground()
     * @see #setRground(Float)
     * @generated
     */
    void unsetRground();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRground <em>Rground</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rground</em>' attribute is set.
     * @see #unsetRground()
     * @see #getRground()
     * @see #setRground(Float)
     * @generated
     */
    boolean isSetRground();

    /**
     * Returns the value of the '<em><b>Xground</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xground</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xground</em>' attribute.
     * @see #isSetXground()
     * @see #unsetXground()
     * @see #setXground(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_Xground()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.xground' kind='element'"
     * @generated
     */
    Float getXground();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getXground <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xground</em>' attribute.
     * @see #isSetXground()
     * @see #unsetXground()
     * @see #getXground()
     * @generated
     */
    void setXground( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getXground <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXground()
     * @see #getXground()
     * @see #setXground(Float)
     * @generated
     */
    void unsetXground();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getXground <em>Xground</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xground</em>' attribute is set.
     * @see #unsetXground()
     * @see #getXground()
     * @see #setXground(Float)
     * @generated
     */
    boolean isSetXground();

    /**
     * Returns the value of the '<em><b>To Mesh Impedance</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Mesh Impedance</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Mesh Impedance</em>' reference list.
     * @see #isSetToMeshImpedance()
     * @see #unsetToMeshImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_ToMeshImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEnd
     * @model opposite="ToTransformerEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.ToMeshImpedance' kind='element'"
     * @generated
     */
    EList< TransformerMeshImpedance > getToMeshImpedance();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToMeshImpedance()
     * @see #getToMeshImpedance()
     * @generated
     */
    void unsetToMeshImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To Mesh Impedance</em>' reference list is set.
     * @see #unsetToMeshImpedance()
     * @see #getToMeshImpedance()
     * @generated
     */
    boolean isSetToMeshImpedance();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTransformerEnd
     * @model opposite="TransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.Terminal' kind='element'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Core Admittance</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Core Admittance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Core Admittance</em>' reference.
     * @see #isSetCoreAdmittance()
     * @see #unsetCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_CoreAdmittance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance#getTransformerEnd
     * @model opposite="TransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.CoreAdmittance' kind='element'"
     * @generated
     */
    TransformerCoreAdmittance getCoreAdmittance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Core Admittance</em>' reference.
     * @see #isSetCoreAdmittance()
     * @see #unsetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @generated
     */
    void setCoreAdmittance( TransformerCoreAdmittance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @generated
     */
    void unsetCoreAdmittance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Core Admittance</em>' reference is set.
     * @see #unsetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @generated
     */
    boolean isSetCoreAdmittance();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getTransformerEnds <em>Transformer Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getTransformerEnds
     * @model opposite="TransformerEnds" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.BaseVoltage' kind='element'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ratio Tap Changer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ratio Tap Changer</em>' reference.
     * @see #isSetRatioTapChanger()
     * @see #unsetRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_RatioTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd
     * @model opposite="TransformerEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.RatioTapChanger' kind='element'"
     * @generated
     */
    RatioTapChanger getRatioTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
     * @see #isSetRatioTapChanger()
     * @see #unsetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @generated
     */
    void setRatioTapChanger( RatioTapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @generated
     */
    void unsetRatioTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer</em>' reference is set.
     * @see #unsetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @generated
     */
    boolean isSetRatioTapChanger();

    /**
     * Returns the value of the '<em><b>Star Impedance</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Star Impedance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Star Impedance</em>' reference.
     * @see #isSetStarImpedance()
     * @see #unsetStarImpedance()
     * @see #setStarImpedance(TransformerStarImpedance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_StarImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance#getTransformerEnd
     * @model opposite="TransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.StarImpedance' kind='element'"
     * @generated
     */
    TransformerStarImpedance getStarImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getStarImpedance <em>Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Star Impedance</em>' reference.
     * @see #isSetStarImpedance()
     * @see #unsetStarImpedance()
     * @see #getStarImpedance()
     * @generated
     */
    void setStarImpedance( TransformerStarImpedance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getStarImpedance <em>Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStarImpedance()
     * @see #getStarImpedance()
     * @see #setStarImpedance(TransformerStarImpedance)
     * @generated
     */
    void unsetStarImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getStarImpedance <em>Star Impedance</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Star Impedance</em>' reference is set.
     * @see #unsetStarImpedance()
     * @see #getStarImpedance()
     * @see #setStarImpedance(TransformerStarImpedance)
     * @generated
     */
    boolean isSetStarImpedance();

    /**
     * Returns the value of the '<em><b>From Mesh Impedance</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Mesh Impedance</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Mesh Impedance</em>' reference list.
     * @see #isSetFromMeshImpedance()
     * @see #unsetFromMeshImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_FromMeshImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd
     * @model opposite="FromTransformerEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.FromMeshImpedance' kind='element'"
     * @generated
     */
    EList< TransformerMeshImpedance > getFromMeshImpedance();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromMeshImpedance()
     * @see #getFromMeshImpedance()
     * @generated
     */
    void unsetFromMeshImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From Mesh Impedance</em>' reference list is set.
     * @see #unsetFromMeshImpedance()
     * @see #getFromMeshImpedance()
     * @generated
     */
    boolean isSetFromMeshImpedance();

    /**
     * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Tap Changer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Tap Changer</em>' reference.
     * @see #isSetPhaseTapChanger()
     * @see #unsetPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEnd_PhaseTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd
     * @model opposite="TransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEnd.PhaseTapChanger' kind='element'"
     * @generated
     */
    PhaseTapChanger getPhaseTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
     * @see #isSetPhaseTapChanger()
     * @see #unsetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @generated
     */
    void setPhaseTapChanger( PhaseTapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @generated
     */
    void unsetPhaseTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer</em>' reference is set.
     * @see #unsetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @generated
     */
    boolean isSetPhaseTapChanger();

} // TransformerEnd
