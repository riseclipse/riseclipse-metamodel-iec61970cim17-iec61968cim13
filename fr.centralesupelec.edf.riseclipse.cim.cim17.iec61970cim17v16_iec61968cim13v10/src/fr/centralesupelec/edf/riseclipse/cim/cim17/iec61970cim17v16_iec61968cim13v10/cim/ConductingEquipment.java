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
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getJumpingAction <em>Jumping Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getGroundingAction <em>Grounding Action</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment()
 * @model
 * @generated
 */
public interface ConductingEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>Sv Status</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvStatus}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Status</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Status</em>' reference list.
     * @see #isSetSvStatus()
     * @see #unsetSvStatus()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_SvStatus()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvStatus#getConductingEquipment
     * @model opposite="ConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.SvStatus' kind='element'"
     * @generated
     */
    EList< SvStatus > getSvStatus();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvStatus()
     * @see #getSvStatus()
     * @generated
     */
    void unsetSvStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Status</em>' reference list is set.
     * @see #unsetSvStatus()
     * @see #getSvStatus()
     * @generated
     */
    boolean isSetSvStatus();

    /**
     * Returns the value of the '<em><b>Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminals</em>' reference list.
     * @see #isSetTerminals()
     * @see #unsetTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_Terminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment
     * @model opposite="ConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.Terminals' kind='element'"
     * @generated
     */
    EList< Terminal > getTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getTerminals <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminals()
     * @see #getTerminals()
     * @generated
     */
    void unsetTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getTerminals <em>Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminals</em>' reference list is set.
     * @see #unsetTerminals()
     * @see #getTerminals()
     * @generated
     */
    boolean isSetTerminals();

    /**
     * Returns the value of the '<em><b>Jumping Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction#getJumpedEquipments <em>Jumped Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jumping Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jumping Action</em>' reference.
     * @see #isSetJumpingAction()
     * @see #unsetJumpingAction()
     * @see #setJumpingAction(JumperAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_JumpingAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction#getJumpedEquipments
     * @model opposite="JumpedEquipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.JumpingAction' kind='element'"
     * @generated
     */
    JumperAction getJumpingAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getJumpingAction <em>Jumping Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jumping Action</em>' reference.
     * @see #isSetJumpingAction()
     * @see #unsetJumpingAction()
     * @see #getJumpingAction()
     * @generated
     */
    void setJumpingAction( JumperAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getJumpingAction <em>Jumping Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetJumpingAction()
     * @see #getJumpingAction()
     * @see #setJumpingAction(JumperAction)
     * @generated
     */
    void unsetJumpingAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getJumpingAction <em>Jumping Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Jumping Action</em>' reference is set.
     * @see #unsetJumpingAction()
     * @see #getJumpingAction()
     * @see #setJumpingAction(JumperAction)
     * @generated
     */
    boolean isSetJumpingAction();

    /**
     * Returns the value of the '<em><b>Protection Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protection Equipments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protection Equipments</em>' reference list.
     * @see #isSetProtectionEquipments()
     * @see #unsetProtectionEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_ProtectionEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getConductingEquipments
     * @model opposite="ConductingEquipments" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.ProtectionEquipments' kind='element'"
     * @generated
     */
    EList< ProtectionEquipment > getProtectionEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtectionEquipments()
     * @see #getProtectionEquipments()
     * @generated
     */
    void unsetProtectionEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Protection Equipments</em>' reference list is set.
     * @see #unsetProtectionEquipments()
     * @see #getProtectionEquipments()
     * @generated
     */
    boolean isSetProtectionEquipments();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.BaseVoltage' kind='element'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference is set.
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
     * Returns the value of the '<em><b>Grounding Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction#getGroundedEquipment <em>Grounded Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounding Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounding Action</em>' reference.
     * @see #isSetGroundingAction()
     * @see #unsetGroundingAction()
     * @see #setGroundingAction(GroundAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConductingEquipment_GroundingAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction#getGroundedEquipment
     * @model opposite="GroundedEquipment" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConductingEquipment.GroundingAction' kind='element'"
     * @generated
     */
    GroundAction getGroundingAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getGroundingAction <em>Grounding Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounding Action</em>' reference.
     * @see #isSetGroundingAction()
     * @see #unsetGroundingAction()
     * @see #getGroundingAction()
     * @generated
     */
    void setGroundingAction( GroundAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getGroundingAction <em>Grounding Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGroundingAction()
     * @see #getGroundingAction()
     * @see #setGroundingAction(GroundAction)
     * @generated
     */
    void unsetGroundingAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getGroundingAction <em>Grounding Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounding Action</em>' reference is set.
     * @see #unsetGroundingAction()
     * @see #getGroundingAction()
     * @see #setGroundingAction(GroundAction)
     * @generated
     */
    boolean isSetGroundingAction();

} // ConductingEquipment
