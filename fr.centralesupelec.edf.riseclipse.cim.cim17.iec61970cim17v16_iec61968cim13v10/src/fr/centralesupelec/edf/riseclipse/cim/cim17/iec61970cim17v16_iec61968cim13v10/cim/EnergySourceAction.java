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
 * A representation of the model object '<em><b>Energy Source Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getEnergySource <em>Energy Source</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourceAction()
 * @model
 * @generated
 */
public interface EnergySourceAction extends SwitchingStep {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TempEquipActionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TempEquipActionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(TempEquipActionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourceAction_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergySourceAction.kind' kind='element'"
     * @generated
     */
    TempEquipActionKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TempEquipActionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( TempEquipActionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(TempEquipActionKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(TempEquipActionKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Switching Step Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getEnergySourceActions <em>Energy Source Actions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Step Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Step Group</em>' reference.
     * @see #isSetSwitchingStepGroup()
     * @see #unsetSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourceAction_SwitchingStepGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getEnergySourceActions
     * @model opposite="EnergySourceActions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergySourceAction.SwitchingStepGroup' kind='element'"
     * @generated
     */
    SwitchingStepGroup getSwitchingStepGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Step Group</em>' reference.
     * @see #isSetSwitchingStepGroup()
     * @see #unsetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @generated
     */
    void setSwitchingStepGroup( SwitchingStepGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @generated
     */
    void unsetSwitchingStepGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Step Group</em>' reference is set.
     * @see #unsetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @generated
     */
    boolean isSetSwitchingStepGroup();

    /**
     * Returns the value of the '<em><b>Energy Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource#getEnergySourceAction <em>Energy Source Action</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Source</em>' reference.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see #setEnergySource(EnergySource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourceAction_EnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource#getEnergySourceAction
     * @model opposite="EnergySourceAction" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergySourceAction.EnergySource' kind='element'"
     * @generated
     */
    EnergySource getEnergySource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getEnergySource <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Source</em>' reference.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    void setEnergySource( EnergySource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getEnergySource <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySource()
     * @see #getEnergySource()
     * @see #setEnergySource(EnergySource)
     * @generated
     */
    void unsetEnergySource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction#getEnergySource <em>Energy Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Source</em>' reference is set.
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @see #setEnergySource(EnergySource)
     * @generated
     */
    boolean isSetEnergySource();

} // EnergySourceAction
