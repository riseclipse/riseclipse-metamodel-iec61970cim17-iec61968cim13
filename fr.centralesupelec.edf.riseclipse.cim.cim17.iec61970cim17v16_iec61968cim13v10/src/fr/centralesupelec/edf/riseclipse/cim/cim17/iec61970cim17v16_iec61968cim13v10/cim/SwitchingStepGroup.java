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
 * A representation of the model object '<em><b>Switching Step Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getIsFreeSequence <em>Is Free Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGenericActions <em>Generic Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getEnergySourceActions <em>Energy Source Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGroundActions <em>Ground Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getJumperActions <em>Jumper Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getTagActions <em>Tag Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getClearanceActions <em>Clearance Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getCutActions <em>Cut Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchActions <em>Switch Actions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup()
 * @model
 * @generated
 */
public interface SwitchingStepGroup extends Document {
    /**
     * Returns the value of the '<em><b>Is Free Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Free Sequence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Free Sequence</em>' attribute.
     * @see #isSetIsFreeSequence()
     * @see #unsetIsFreeSequence()
     * @see #setIsFreeSequence(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_IsFreeSequence()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.isFreeSequence' kind='element'"
     * @generated
     */
    Boolean getIsFreeSequence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getIsFreeSequence <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Free Sequence</em>' attribute.
     * @see #isSetIsFreeSequence()
     * @see #unsetIsFreeSequence()
     * @see #getIsFreeSequence()
     * @generated
     */
    void setIsFreeSequence( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getIsFreeSequence <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsFreeSequence()
     * @see #getIsFreeSequence()
     * @see #setIsFreeSequence(Boolean)
     * @generated
     */
    void unsetIsFreeSequence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getIsFreeSequence <em>Is Free Sequence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Free Sequence</em>' attribute is set.
     * @see #unsetIsFreeSequence()
     * @see #getIsFreeSequence()
     * @see #setIsFreeSequence(Boolean)
     * @generated
     */
    boolean isSetIsFreeSequence();

    /**
     * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #setSequenceNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_SequenceNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.sequenceNumber' kind='element'"
     * @generated
     */
    Integer getSequenceNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @generated
     */
    void setSequenceNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(Integer)
     * @generated
     */
    void unsetSequenceNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(Integer)
     * @generated
     */
    boolean isSetSequenceNumber();

    /**
     * Returns the value of the '<em><b>Generic Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generic Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Actions</em>' reference list.
     * @see #isSetGenericActions()
     * @see #unsetGenericActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_GenericActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.GenericActions' kind='element'"
     * @generated
     */
    EList< GenericAction > getGenericActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGenericActions <em>Generic Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenericActions()
     * @see #getGenericActions()
     * @generated
     */
    void unsetGenericActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGenericActions <em>Generic Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generic Actions</em>' reference list is set.
     * @see #unsetGenericActions()
     * @see #getGenericActions()
     * @generated
     */
    boolean isSetGenericActions();

    /**
     * Returns the value of the '<em><b>Energy Source Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Source Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Source Actions</em>' reference list.
     * @see #isSetEnergySourceActions()
     * @see #unsetEnergySourceActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_EnergySourceActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.EnergySourceActions' kind='element'"
     * @generated
     */
    EList< EnergySourceAction > getEnergySourceActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getEnergySourceActions <em>Energy Source Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySourceActions()
     * @see #getEnergySourceActions()
     * @generated
     */
    void unsetEnergySourceActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getEnergySourceActions <em>Energy Source Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Source Actions</em>' reference list is set.
     * @see #unsetEnergySourceActions()
     * @see #getEnergySourceActions()
     * @generated
     */
    boolean isSetEnergySourceActions();

    /**
     * Returns the value of the '<em><b>Ground Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ground Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ground Actions</em>' reference list.
     * @see #isSetGroundActions()
     * @see #unsetGroundActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_GroundActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.GroundActions' kind='element'"
     * @generated
     */
    EList< GroundAction > getGroundActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGroundActions <em>Ground Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGroundActions()
     * @see #getGroundActions()
     * @generated
     */
    void unsetGroundActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getGroundActions <em>Ground Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ground Actions</em>' reference list is set.
     * @see #unsetGroundActions()
     * @see #getGroundActions()
     * @generated
     */
    boolean isSetGroundActions();

    /**
     * Returns the value of the '<em><b>Switching Plan</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSwitchingStepGroups <em>Switching Step Groups</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Plan</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_SwitchingPlan()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSwitchingStepGroups
     * @model opposite="SwitchingStepGroups" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.SwitchingPlan' kind='element'"
     * @generated
     */
    SwitchingPlan getSwitchingPlan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @generated
     */
    void setSwitchingPlan( SwitchingPlan value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    void unsetSwitchingPlan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan <em>Switching Plan</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Plan</em>' reference is set.
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    boolean isSetSwitchingPlan();

    /**
     * Returns the value of the '<em><b>Jumper Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jumper Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jumper Actions</em>' reference list.
     * @see #isSetJumperActions()
     * @see #unsetJumperActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_JumperActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.JumperActions' kind='element'"
     * @generated
     */
    EList< JumperAction > getJumperActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getJumperActions <em>Jumper Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetJumperActions()
     * @see #getJumperActions()
     * @generated
     */
    void unsetJumperActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getJumperActions <em>Jumper Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Jumper Actions</em>' reference list is set.
     * @see #unsetJumperActions()
     * @see #getJumperActions()
     * @generated
     */
    boolean isSetJumperActions();

    /**
     * Returns the value of the '<em><b>Tag Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TagAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TagAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag Actions</em>' reference list.
     * @see #isSetTagActions()
     * @see #unsetTagActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_TagActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TagAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.TagActions' kind='element'"
     * @generated
     */
    EList< TagAction > getTagActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getTagActions <em>Tag Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTagActions()
     * @see #getTagActions()
     * @generated
     */
    void unsetTagActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getTagActions <em>Tag Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tag Actions</em>' reference list is set.
     * @see #unsetTagActions()
     * @see #getTagActions()
     * @generated
     */
    boolean isSetTagActions();

    /**
     * Returns the value of the '<em><b>Clearance Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clearance Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clearance Actions</em>' reference list.
     * @see #isSetClearanceActions()
     * @see #unsetClearanceActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_ClearanceActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.ClearanceActions' kind='element'"
     * @generated
     */
    EList< ClearanceAction > getClearanceActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getClearanceActions <em>Clearance Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClearanceActions()
     * @see #getClearanceActions()
     * @generated
     */
    void unsetClearanceActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getClearanceActions <em>Clearance Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Clearance Actions</em>' reference list is set.
     * @see #unsetClearanceActions()
     * @see #getClearanceActions()
     * @generated
     */
    boolean isSetClearanceActions();

    /**
     * Returns the value of the '<em><b>Cut Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CutAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CutAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cut Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cut Actions</em>' reference list.
     * @see #isSetCutActions()
     * @see #unsetCutActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_CutActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CutAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.CutActions' kind='element'"
     * @generated
     */
    EList< CutAction > getCutActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getCutActions <em>Cut Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCutActions()
     * @see #getCutActions()
     * @generated
     */
    void unsetCutActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getCutActions <em>Cut Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cut Actions</em>' reference list is set.
     * @see #unsetCutActions()
     * @see #getCutActions()
     * @generated
     */
    boolean isSetCutActions();

    /**
     * Returns the value of the '<em><b>Switch Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup <em>Switching Step Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Actions</em>' reference list.
     * @see #isSetSwitchActions()
     * @see #unsetSwitchActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingStepGroup_SwitchActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup
     * @model opposite="SwitchingStepGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingStepGroup.SwitchActions' kind='element'"
     * @generated
     */
    EList< SwitchAction > getSwitchActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchActions <em>Switch Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchActions()
     * @see #getSwitchActions()
     * @generated
     */
    void unsetSwitchActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchActions <em>Switch Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch Actions</em>' reference list is set.
     * @see #unsetSwitchActions()
     * @see #getSwitchActions()
     * @generated
     */
    boolean isSetSwitchActions();

} // SwitchingStepGroup
