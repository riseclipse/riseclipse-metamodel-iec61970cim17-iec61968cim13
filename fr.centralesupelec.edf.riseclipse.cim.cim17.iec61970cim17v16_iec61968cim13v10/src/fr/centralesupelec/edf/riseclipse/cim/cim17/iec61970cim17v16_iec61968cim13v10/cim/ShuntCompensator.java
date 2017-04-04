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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNomU <em>Nom U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getPhaseConnection <em>Phase Connection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getShuntCompensatorPhase <em>Shunt Compensator Phase</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator()
 * @model
 * @generated
 */
public interface ShuntCompensator extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>AVR Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AVR Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AVR Delay</em>' attribute.
     * @see #isSetAVRDelay()
     * @see #unsetAVRDelay()
     * @see #setAVRDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_AVRDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.aVRDelay' kind='element'"
     * @generated
     */
    Float getAVRDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AVR Delay</em>' attribute.
     * @see #isSetAVRDelay()
     * @see #unsetAVRDelay()
     * @see #getAVRDelay()
     * @generated
     */
    void setAVRDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAVRDelay()
     * @see #getAVRDelay()
     * @see #setAVRDelay(Float)
     * @generated
     */
    void unsetAVRDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AVR Delay</em>' attribute is set.
     * @see #unsetAVRDelay()
     * @see #getAVRDelay()
     * @see #setAVRDelay(Float)
     * @generated
     */
    boolean isSetAVRDelay();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_Grounded()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.grounded' kind='element'"
     * @generated
     */
    Boolean getGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    void unsetGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #setMaximumSections(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_MaximumSections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.maximumSections' kind='element'"
     * @generated
     */
    Integer getMaximumSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @generated
     */
    void setMaximumSections( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(Integer)
     * @generated
     */
    void unsetMaximumSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Sections</em>' attribute is set.
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(Integer)
     * @generated
     */
    boolean isSetMaximumSections();

    /**
     * Returns the value of the '<em><b>Nom U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nom U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nom U</em>' attribute.
     * @see #isSetNomU()
     * @see #unsetNomU()
     * @see #setNomU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_NomU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.nomU' kind='element'"
     * @generated
     */
    Float getNomU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nom U</em>' attribute.
     * @see #isSetNomU()
     * @see #unsetNomU()
     * @see #getNomU()
     * @generated
     */
    void setNomU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNomU()
     * @see #getNomU()
     * @see #setNomU(Float)
     * @generated
     */
    void unsetNomU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nom U</em>' attribute is set.
     * @see #unsetNomU()
     * @see #getNomU()
     * @see #setNomU(Float)
     * @generated
     */
    boolean isSetNomU();

    /**
     * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #setNormalSections(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_NormalSections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.normalSections' kind='element'"
     * @generated
     */
    Integer getNormalSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @generated
     */
    void setNormalSections( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(Integer)
     * @generated
     */
    void unsetNormalSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Sections</em>' attribute is set.
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(Integer)
     * @generated
     */
    boolean isSetNormalSections();

    /**
     * Returns the value of the '<em><b>Phase Connection</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Connection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Connection</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind
     * @see #isSetPhaseConnection()
     * @see #unsetPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_PhaseConnection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.phaseConnection' kind='element'"
     * @generated
     */
    PhaseShuntConnectionKind getPhaseConnection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getPhaseConnection <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Connection</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind
     * @see #isSetPhaseConnection()
     * @see #unsetPhaseConnection()
     * @see #getPhaseConnection()
     * @generated
     */
    void setPhaseConnection( PhaseShuntConnectionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getPhaseConnection <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseConnection()
     * @see #getPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @generated
     */
    void unsetPhaseConnection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getPhaseConnection <em>Phase Connection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Connection</em>' attribute is set.
     * @see #unsetPhaseConnection()
     * @see #getPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @generated
     */
    boolean isSetPhaseConnection();

    /**
     * Returns the value of the '<em><b>Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #setSections(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_Sections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.sections' kind='element'"
     * @generated
     */
    Float getSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #getSections()
     * @generated
     */
    void setSections( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSections()
     * @see #getSections()
     * @see #setSections(Float)
     * @generated
     */
    void unsetSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sections</em>' attribute is set.
     * @see #unsetSections()
     * @see #getSections()
     * @see #setSections(Float)
     * @generated
     */
    boolean isSetSections();

    /**
     * Returns the value of the '<em><b>Switch On Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch On Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch On Count</em>' attribute.
     * @see #isSetSwitchOnCount()
     * @see #unsetSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_SwitchOnCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.switchOnCount' kind='element'"
     * @generated
     */
    Integer getSwitchOnCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch On Count</em>' attribute.
     * @see #isSetSwitchOnCount()
     * @see #unsetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @generated
     */
    void setSwitchOnCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @generated
     */
    void unsetSwitchOnCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch On Count</em>' attribute is set.
     * @see #unsetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @generated
     */
    boolean isSetSwitchOnCount();

    /**
     * Returns the value of the '<em><b>Switch On Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch On Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch On Date</em>' attribute.
     * @see #isSetSwitchOnDate()
     * @see #unsetSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_SwitchOnDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.switchOnDate' kind='element'"
     * @generated
     */
    Date getSwitchOnDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch On Date</em>' attribute.
     * @see #isSetSwitchOnDate()
     * @see #unsetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @generated
     */
    void setSwitchOnDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @generated
     */
    void unsetSwitchOnDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch On Date</em>' attribute is set.
     * @see #unsetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @generated
     */
    boolean isSetSwitchOnDate();

    /**
     * Returns the value of the '<em><b>Voltage Sensitivity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Sensitivity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Sensitivity</em>' attribute.
     * @see #isSetVoltageSensitivity()
     * @see #unsetVoltageSensitivity()
     * @see #setVoltageSensitivity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_VoltageSensitivity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.voltageSensitivity' kind='element'"
     * @generated
     */
    Float getVoltageSensitivity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Sensitivity</em>' attribute.
     * @see #isSetVoltageSensitivity()
     * @see #unsetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @generated
     */
    void setVoltageSensitivity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @see #setVoltageSensitivity(Float)
     * @generated
     */
    void unsetVoltageSensitivity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Sensitivity</em>' attribute is set.
     * @see #unsetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @see #setVoltageSensitivity(Float)
     * @generated
     */
    boolean isSetVoltageSensitivity();

    /**
     * Returns the value of the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Shunt Compensator Sections</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Shunt Compensator Sections</em>' reference.
     * @see #isSetSvShuntCompensatorSections()
     * @see #unsetSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_SvShuntCompensatorSections()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator
     * @model opposite="ShuntCompensator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.SvShuntCompensatorSections' kind='element'"
     * @generated
     */
    SvShuntCompensatorSections getSvShuntCompensatorSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Shunt Compensator Sections</em>' reference.
     * @see #isSetSvShuntCompensatorSections()
     * @see #unsetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @generated
     */
    void setSvShuntCompensatorSections( SvShuntCompensatorSections value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @generated
     */
    void unsetSvShuntCompensatorSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Shunt Compensator Sections</em>' reference is set.
     * @see #unsetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @generated
     */
    boolean isSetSvShuntCompensatorSections();

    /**
     * Returns the value of the '<em><b>Shunt Compensator Phase</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shunt Compensator Phase</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shunt Compensator Phase</em>' reference list.
     * @see #isSetShuntCompensatorPhase()
     * @see #unsetShuntCompensatorPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensator_ShuntCompensatorPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator
     * @model opposite="ShuntCompensator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensator.ShuntCompensatorPhase' kind='element'"
     * @generated
     */
    EList< ShuntCompensatorPhase > getShuntCompensatorPhase();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getShuntCompensatorPhase <em>Shunt Compensator Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShuntCompensatorPhase()
     * @see #getShuntCompensatorPhase()
     * @generated
     */
    void unsetShuntCompensatorPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getShuntCompensatorPhase <em>Shunt Compensator Phase</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shunt Compensator Phase</em>' reference list is set.
     * @see #unsetShuntCompensatorPhase()
     * @see #getShuntCompensatorPhase()
     * @generated
     */
    boolean isSetShuntCompensatorPhase();

} // ShuntCompensator
