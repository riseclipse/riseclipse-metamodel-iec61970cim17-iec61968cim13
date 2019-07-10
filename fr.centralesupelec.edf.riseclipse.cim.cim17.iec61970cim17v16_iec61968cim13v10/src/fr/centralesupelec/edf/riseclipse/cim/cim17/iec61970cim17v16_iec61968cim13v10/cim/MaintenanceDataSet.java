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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceDataSet()
 * @model
 * @generated
 */
public interface MaintenanceDataSet extends ProcedureDataSet {
    /**
     * Returns the value of the '<em><b>Condition After</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition After</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition After</em>' attribute.
     * @see #isSetConditionAfter()
     * @see #unsetConditionAfter()
     * @see #setConditionAfter(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceDataSet_ConditionAfter()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceDataSet.conditionAfter' kind='element'"
     * @generated
     */
    String getConditionAfter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition After</em>' attribute.
     * @see #isSetConditionAfter()
     * @see #unsetConditionAfter()
     * @see #getConditionAfter()
     * @generated
     */
    void setConditionAfter( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConditionAfter()
     * @see #getConditionAfter()
     * @see #setConditionAfter(String)
     * @generated
     */
    void unsetConditionAfter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Condition After</em>' attribute is set.
     * @see #unsetConditionAfter()
     * @see #getConditionAfter()
     * @see #setConditionAfter(String)
     * @generated
     */
    boolean isSetConditionAfter();

    /**
     * Returns the value of the '<em><b>Condition Before</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition Before</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition Before</em>' attribute.
     * @see #isSetConditionBefore()
     * @see #unsetConditionBefore()
     * @see #setConditionBefore(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceDataSet_ConditionBefore()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceDataSet.conditionBefore' kind='element'"
     * @generated
     */
    String getConditionBefore();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition Before</em>' attribute.
     * @see #isSetConditionBefore()
     * @see #unsetConditionBefore()
     * @see #getConditionBefore()
     * @generated
     */
    void setConditionBefore( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConditionBefore()
     * @see #getConditionBefore()
     * @see #setConditionBefore(String)
     * @generated
     */
    void unsetConditionBefore();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Condition Before</em>' attribute is set.
     * @see #unsetConditionBefore()
     * @see #getConditionBefore()
     * @see #setConditionBefore(String)
     * @generated
     */
    boolean isSetConditionBefore();

    /**
     * Returns the value of the '<em><b>Maint Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maint Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maint Code</em>' attribute.
     * @see #isSetMaintCode()
     * @see #unsetMaintCode()
     * @see #setMaintCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceDataSet_MaintCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceDataSet.maintCode' kind='element'"
     * @generated
     */
    String getMaintCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maint Code</em>' attribute.
     * @see #isSetMaintCode()
     * @see #unsetMaintCode()
     * @see #getMaintCode()
     * @generated
     */
    void setMaintCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaintCode()
     * @see #getMaintCode()
     * @see #setMaintCode(String)
     * @generated
     */
    void unsetMaintCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maint Code</em>' attribute is set.
     * @see #unsetMaintCode()
     * @see #getMaintCode()
     * @see #setMaintCode(String)
     * @generated
     */
    boolean isSetMaintCode();

} // MaintenanceDataSet
