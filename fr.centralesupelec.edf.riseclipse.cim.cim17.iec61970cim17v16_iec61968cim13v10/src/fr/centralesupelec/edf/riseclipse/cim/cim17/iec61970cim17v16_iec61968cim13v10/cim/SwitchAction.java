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
 * A representation of the model object '<em><b>Switch Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch <em>Operated Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getPlannedOutage <em>Planned Outage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchAction()
 * @model
 * @generated
 */
public interface SwitchAction extends SwitchingStep {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchActionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchActionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(SwitchActionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchAction_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchAction.kind' kind='element'"
     * @generated
     */
    SwitchActionKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchActionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( SwitchActionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(SwitchActionKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(SwitchActionKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Operated Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction <em>Switch Action</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operated Switch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operated Switch</em>' reference.
     * @see #isSetOperatedSwitch()
     * @see #unsetOperatedSwitch()
     * @see #setOperatedSwitch(Switch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchAction_OperatedSwitch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction
     * @model opposite="SwitchAction" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchAction.OperatedSwitch' kind='element'"
     * @generated
     */
    Switch getOperatedSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch <em>Operated Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operated Switch</em>' reference.
     * @see #isSetOperatedSwitch()
     * @see #unsetOperatedSwitch()
     * @see #getOperatedSwitch()
     * @generated
     */
    void setOperatedSwitch( Switch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch <em>Operated Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatedSwitch()
     * @see #getOperatedSwitch()
     * @see #setOperatedSwitch(Switch)
     * @generated
     */
    void unsetOperatedSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch <em>Operated Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operated Switch</em>' reference is set.
     * @see #unsetOperatedSwitch()
     * @see #getOperatedSwitch()
     * @see #setOperatedSwitch(Switch)
     * @generated
     */
    boolean isSetOperatedSwitch();

    /**
     * Returns the value of the '<em><b>Switching Step Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchActions <em>Switch Actions</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchAction_SwitchingStepGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchActions
     * @model opposite="SwitchActions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchAction.SwitchingStepGroup' kind='element'"
     * @generated
     */
    SwitchingStepGroup getSwitchingStepGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @generated
     */
    void unsetSwitchingStepGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference is set.
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
     * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getPlannedSwitchActions <em>Planned Switch Actions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Planned Outage</em>' reference.
     * @see #isSetPlannedOutage()
     * @see #unsetPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchAction_PlannedOutage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getPlannedSwitchActions
     * @model opposite="PlannedSwitchActions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchAction.PlannedOutage' kind='element'"
     * @generated
     */
    Outage getPlannedOutage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getPlannedOutage <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Planned Outage</em>' reference.
     * @see #isSetPlannedOutage()
     * @see #unsetPlannedOutage()
     * @see #getPlannedOutage()
     * @generated
     */
    void setPlannedOutage( Outage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getPlannedOutage <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlannedOutage()
     * @see #getPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @generated
     */
    void unsetPlannedOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getPlannedOutage <em>Planned Outage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Planned Outage</em>' reference is set.
     * @see #unsetPlannedOutage()
     * @see #getPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @generated
     */
    boolean isSetPlannedOutage();

} // SwitchAction
