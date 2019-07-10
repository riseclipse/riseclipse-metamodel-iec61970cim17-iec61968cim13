/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getRank <em>Rank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getOutage <em>Outage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSwitchingStepGroups <em>Switching Step Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSafetyDocuments <em>Safety Documents</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan()
 * @model
 * @generated
 */
public interface SwitchingPlan extends SwitchingStepGroup {
    /**
     * Returns the value of the '<em><b>Purpose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purpose</em>' attribute.
     * @see #isSetPurpose()
     * @see #unsetPurpose()
     * @see #setPurpose(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_Purpose()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.purpose' kind='element'"
     * @generated
     */
    String getPurpose();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getPurpose <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purpose</em>' attribute.
     * @see #isSetPurpose()
     * @see #unsetPurpose()
     * @see #getPurpose()
     * @generated
     */
    void setPurpose( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getPurpose <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPurpose()
     * @see #getPurpose()
     * @see #setPurpose(String)
     * @generated
     */
    void unsetPurpose();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getPurpose <em>Purpose</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Purpose</em>' attribute is set.
     * @see #unsetPurpose()
     * @see #getPurpose()
     * @see #setPurpose(String)
     * @generated
     */
    boolean isSetPurpose();

    /**
     * Returns the value of the '<em><b>Rank</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rank</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rank</em>' attribute.
     * @see #isSetRank()
     * @see #unsetRank()
     * @see #setRank(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_Rank()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.rank' kind='element'"
     * @generated
     */
    Integer getRank();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getRank <em>Rank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rank</em>' attribute.
     * @see #isSetRank()
     * @see #unsetRank()
     * @see #getRank()
     * @generated
     */
    void setRank( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getRank <em>Rank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRank()
     * @see #getRank()
     * @see #setRank(Integer)
     * @generated
     */
    void unsetRank();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getRank <em>Rank</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rank</em>' attribute is set.
     * @see #unsetRank()
     * @see #getRank()
     * @see #setRank(Integer)
     * @generated
     */
    boolean isSetRank();

    /**
     * Returns the value of the '<em><b>Outage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getSwitchingPlans <em>Switching Plans</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #setOutage(Outage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_Outage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getSwitchingPlans
     * @model opposite="SwitchingPlans" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.Outage' kind='element'"
     * @generated
     */
    Outage getOutage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #getOutage()
     * @generated
     */
    void setOutage( Outage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    void unsetOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getOutage <em>Outage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage</em>' reference is set.
     * @see #unsetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    boolean isSetOutage();

    /**
     * Returns the value of the '<em><b>Switching Step Groups</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan <em>Switching Plan</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Step Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Step Groups</em>' reference list.
     * @see #isSetSwitchingStepGroups()
     * @see #unsetSwitchingStepGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_SwitchingStepGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup#getSwitchingPlan
     * @model opposite="SwitchingPlan" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.SwitchingStepGroups' kind='element'"
     * @generated
     */
    EList< SwitchingStepGroup > getSwitchingStepGroups();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSwitchingStepGroups <em>Switching Step Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingStepGroups()
     * @see #getSwitchingStepGroups()
     * @generated
     */
    void unsetSwitchingStepGroups();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSwitchingStepGroups <em>Switching Step Groups</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Step Groups</em>' reference list is set.
     * @see #unsetSwitchingStepGroups()
     * @see #getSwitchingStepGroups()
     * @generated
     */
    boolean isSetSwitchingStepGroups();

    /**
     * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Tasks</em>' reference list.
     * @see #isSetWorkTasks()
     * @see #unsetWorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_WorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan
     * @model opposite="SwitchingPlan" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.WorkTasks' kind='element'"
     * @generated
     */
    EList< WorkTask > getWorkTasks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getWorkTasks <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    void unsetWorkTasks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getWorkTasks <em>Work Tasks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Tasks</em>' reference list is set.
     * @see #unsetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    boolean isSetWorkTasks();

    /**
     * Returns the value of the '<em><b>Safety Documents</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Safety Documents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Safety Documents</em>' reference list.
     * @see #isSetSafetyDocuments()
     * @see #unsetSafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchingPlan_SafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan
     * @model opposite="SwitchingPlan" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchingPlan.SafetyDocuments' kind='element'"
     * @generated
     */
    EList< SafetyDocument > getSafetyDocuments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSafetyDocuments <em>Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSafetyDocuments()
     * @see #getSafetyDocuments()
     * @generated
     */
    void unsetSafetyDocuments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSafetyDocuments <em>Safety Documents</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Safety Documents</em>' reference list is set.
     * @see #unsetSafetyDocuments()
     * @see #getSafetyDocuments()
     * @generated
     */
    boolean isSetSafetyDocuments();

} // SwitchingPlan
