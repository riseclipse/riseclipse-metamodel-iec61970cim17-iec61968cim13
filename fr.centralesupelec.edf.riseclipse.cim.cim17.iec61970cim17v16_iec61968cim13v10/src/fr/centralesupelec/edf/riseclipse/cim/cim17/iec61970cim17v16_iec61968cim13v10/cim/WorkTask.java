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

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getContractorCost <em>Contractor Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrewETA <em>Crew ETA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborCost <em>Labor Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborHours <em>Labor Hours</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMateriallCost <em>Materiall Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getStartedDateTime <em>Started Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getTaskKind <em>Task Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getToolCost <em>Tool Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset <em>Old Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getProcedureDataSet <em>Procedure Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork <em>Work</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrews <em>Crews</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMaterialItems <em>Material Items</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask()
 * @model
 * @generated
 */
public interface WorkTask extends BaseWork {
    /**
     * Returns the value of the '<em><b>Completed Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completed Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Completed Date Time</em>' attribute.
     * @see #isSetCompletedDateTime()
     * @see #unsetCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_CompletedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.completedDateTime' kind='element'"
     * @generated
     */
    Date getCompletedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completed Date Time</em>' attribute.
     * @see #isSetCompletedDateTime()
     * @see #unsetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @generated
     */
    void setCompletedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @generated
     */
    void unsetCompletedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCompletedDateTime <em>Completed Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completed Date Time</em>' attribute is set.
     * @see #unsetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @generated
     */
    boolean isSetCompletedDateTime();

    /**
     * Returns the value of the '<em><b>Contractor Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contractor Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contractor Cost</em>' attribute.
     * @see #isSetContractorCost()
     * @see #unsetContractorCost()
     * @see #setContractorCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_ContractorCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.contractorCost' kind='element'"
     * @generated
     */
    BigDecimal getContractorCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getContractorCost <em>Contractor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contractor Cost</em>' attribute.
     * @see #isSetContractorCost()
     * @see #unsetContractorCost()
     * @see #getContractorCost()
     * @generated
     */
    void setContractorCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getContractorCost <em>Contractor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContractorCost()
     * @see #getContractorCost()
     * @see #setContractorCost(BigDecimal)
     * @generated
     */
    void unsetContractorCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getContractorCost <em>Contractor Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contractor Cost</em>' attribute is set.
     * @see #unsetContractorCost()
     * @see #getContractorCost()
     * @see #setContractorCost(BigDecimal)
     * @generated
     */
    boolean isSetContractorCost();

    /**
     * Returns the value of the '<em><b>Crew ETA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crew ETA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crew ETA</em>' attribute.
     * @see #isSetCrewETA()
     * @see #unsetCrewETA()
     * @see #setCrewETA(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_CrewETA()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.crewETA' kind='element'"
     * @generated
     */
    Date getCrewETA();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crew ETA</em>' attribute.
     * @see #isSetCrewETA()
     * @see #unsetCrewETA()
     * @see #getCrewETA()
     * @generated
     */
    void setCrewETA( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrewETA()
     * @see #getCrewETA()
     * @see #setCrewETA(Date)
     * @generated
     */
    void unsetCrewETA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crew ETA</em>' attribute is set.
     * @see #unsetCrewETA()
     * @see #getCrewETA()
     * @see #setCrewETA(Date)
     * @generated
     */
    boolean isSetCrewETA();

    /**
     * Returns the value of the '<em><b>Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instruction</em>' attribute.
     * @see #isSetInstruction()
     * @see #unsetInstruction()
     * @see #setInstruction(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_Instruction()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.instruction' kind='element'"
     * @generated
     */
    String getInstruction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instruction</em>' attribute.
     * @see #isSetInstruction()
     * @see #unsetInstruction()
     * @see #getInstruction()
     * @generated
     */
    void setInstruction( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstruction()
     * @see #getInstruction()
     * @see #setInstruction(String)
     * @generated
     */
    void unsetInstruction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Instruction</em>' attribute is set.
     * @see #unsetInstruction()
     * @see #getInstruction()
     * @see #setInstruction(String)
     * @generated
     */
    boolean isSetInstruction();

    /**
     * Returns the value of the '<em><b>Labor Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Labor Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labor Cost</em>' attribute.
     * @see #isSetLaborCost()
     * @see #unsetLaborCost()
     * @see #setLaborCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_LaborCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.laborCost' kind='element'"
     * @generated
     */
    BigDecimal getLaborCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborCost <em>Labor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labor Cost</em>' attribute.
     * @see #isSetLaborCost()
     * @see #unsetLaborCost()
     * @see #getLaborCost()
     * @generated
     */
    void setLaborCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborCost <em>Labor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLaborCost()
     * @see #getLaborCost()
     * @see #setLaborCost(BigDecimal)
     * @generated
     */
    void unsetLaborCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborCost <em>Labor Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Labor Cost</em>' attribute is set.
     * @see #unsetLaborCost()
     * @see #getLaborCost()
     * @see #setLaborCost(BigDecimal)
     * @generated
     */
    boolean isSetLaborCost();

    /**
     * Returns the value of the '<em><b>Labor Hours</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Labor Hours</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labor Hours</em>' attribute.
     * @see #isSetLaborHours()
     * @see #unsetLaborHours()
     * @see #setLaborHours(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_LaborHours()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.laborHours' kind='element'"
     * @generated
     */
    Float getLaborHours();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborHours <em>Labor Hours</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labor Hours</em>' attribute.
     * @see #isSetLaborHours()
     * @see #unsetLaborHours()
     * @see #getLaborHours()
     * @generated
     */
    void setLaborHours( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborHours <em>Labor Hours</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLaborHours()
     * @see #getLaborHours()
     * @see #setLaborHours(Float)
     * @generated
     */
    void unsetLaborHours();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getLaborHours <em>Labor Hours</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Labor Hours</em>' attribute is set.
     * @see #unsetLaborHours()
     * @see #getLaborHours()
     * @see #setLaborHours(Float)
     * @generated
     */
    boolean isSetLaborHours();

    /**
     * Returns the value of the '<em><b>Materiall Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Materiall Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Materiall Cost</em>' attribute.
     * @see #isSetMateriallCost()
     * @see #unsetMateriallCost()
     * @see #setMateriallCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_MateriallCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.materiallCost' kind='element'"
     * @generated
     */
    BigDecimal getMateriallCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMateriallCost <em>Materiall Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Materiall Cost</em>' attribute.
     * @see #isSetMateriallCost()
     * @see #unsetMateriallCost()
     * @see #getMateriallCost()
     * @generated
     */
    void setMateriallCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMateriallCost <em>Materiall Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMateriallCost()
     * @see #getMateriallCost()
     * @see #setMateriallCost(BigDecimal)
     * @generated
     */
    void unsetMateriallCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMateriallCost <em>Materiall Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Materiall Cost</em>' attribute is set.
     * @see #unsetMateriallCost()
     * @see #getMateriallCost()
     * @see #setMateriallCost(BigDecimal)
     * @generated
     */
    boolean isSetMateriallCost();

    /**
     * Returns the value of the '<em><b>Sched Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sched Override</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sched Override</em>' attribute.
     * @see #isSetSchedOverride()
     * @see #unsetSchedOverride()
     * @see #setSchedOverride(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_SchedOverride()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.schedOverride' kind='element'"
     * @generated
     */
    String getSchedOverride();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sched Override</em>' attribute.
     * @see #isSetSchedOverride()
     * @see #unsetSchedOverride()
     * @see #getSchedOverride()
     * @generated
     */
    void setSchedOverride( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSchedOverride()
     * @see #getSchedOverride()
     * @see #setSchedOverride(String)
     * @generated
     */
    void unsetSchedOverride();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sched Override</em>' attribute is set.
     * @see #unsetSchedOverride()
     * @see #getSchedOverride()
     * @see #setSchedOverride(String)
     * @generated
     */
    boolean isSetSchedOverride();

    /**
     * Returns the value of the '<em><b>Started Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Started Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Started Date Time</em>' attribute.
     * @see #isSetStartedDateTime()
     * @see #unsetStartedDateTime()
     * @see #setStartedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_StartedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.startedDateTime' kind='element'"
     * @generated
     */
    Date getStartedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getStartedDateTime <em>Started Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Started Date Time</em>' attribute.
     * @see #isSetStartedDateTime()
     * @see #unsetStartedDateTime()
     * @see #getStartedDateTime()
     * @generated
     */
    void setStartedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getStartedDateTime <em>Started Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartedDateTime()
     * @see #getStartedDateTime()
     * @see #setStartedDateTime(Date)
     * @generated
     */
    void unsetStartedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getStartedDateTime <em>Started Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Started Date Time</em>' attribute is set.
     * @see #unsetStartedDateTime()
     * @see #getStartedDateTime()
     * @see #setStartedDateTime(Date)
     * @generated
     */
    boolean isSetStartedDateTime();

    /**
     * Returns the value of the '<em><b>Task Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTaskKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTaskKind
     * @see #isSetTaskKind()
     * @see #unsetTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_TaskKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.taskKind' kind='element'"
     * @generated
     */
    WorkTaskKind getTaskKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTaskKind
     * @see #isSetTaskKind()
     * @see #unsetTaskKind()
     * @see #getTaskKind()
     * @generated
     */
    void setTaskKind( WorkTaskKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaskKind()
     * @see #getTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @generated
     */
    void unsetTaskKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Task Kind</em>' attribute is set.
     * @see #unsetTaskKind()
     * @see #getTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @generated
     */
    boolean isSetTaskKind();

    /**
     * Returns the value of the '<em><b>Tool Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tool Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tool Cost</em>' attribute.
     * @see #isSetToolCost()
     * @see #unsetToolCost()
     * @see #setToolCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_ToolCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.toolCost' kind='element'"
     * @generated
     */
    BigDecimal getToolCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getToolCost <em>Tool Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tool Cost</em>' attribute.
     * @see #isSetToolCost()
     * @see #unsetToolCost()
     * @see #getToolCost()
     * @generated
     */
    void setToolCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getToolCost <em>Tool Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToolCost()
     * @see #getToolCost()
     * @see #setToolCost(BigDecimal)
     * @generated
     */
    void unsetToolCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getToolCost <em>Tool Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tool Cost</em>' attribute is set.
     * @see #unsetToolCost()
     * @see #getToolCost()
     * @see #setToolCost(BigDecimal)
     * @generated
     */
    boolean isSetToolCost();

    /**
     * Returns the value of the '<em><b>Old Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getReplacementWorkTasks <em>Replacement Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Asset</em>' reference.
     * @see #isSetOldAsset()
     * @see #unsetOldAsset()
     * @see #setOldAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_OldAsset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getReplacementWorkTasks
     * @model opposite="ReplacementWorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.OldAsset' kind='element'"
     * @generated
     */
    Asset getOldAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Asset</em>' reference.
     * @see #isSetOldAsset()
     * @see #unsetOldAsset()
     * @see #getOldAsset()
     * @generated
     */
    void setOldAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOldAsset()
     * @see #getOldAsset()
     * @see #setOldAsset(Asset)
     * @generated
     */
    void unsetOldAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Old Asset</em>' reference is set.
     * @see #unsetOldAsset()
     * @see #getOldAsset()
     * @see #setOldAsset(Asset)
     * @generated
     */
    boolean isSetOldAsset();

    /**
     * Returns the value of the '<em><b>Procedure Data Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask <em>Work Task</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure Data Set</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure Data Set</em>' reference list.
     * @see #isSetProcedureDataSet()
     * @see #unsetProcedureDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_ProcedureDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask
     * @model opposite="WorkTask" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.ProcedureDataSet' kind='element'"
     * @generated
     */
    EList< ProcedureDataSet > getProcedureDataSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getProcedureDataSet <em>Procedure Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedureDataSet()
     * @see #getProcedureDataSet()
     * @generated
     */
    void unsetProcedureDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getProcedureDataSet <em>Procedure Data Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedure Data Set</em>' reference list is set.
     * @see #unsetProcedureDataSet()
     * @see #getProcedureDataSet()
     * @generated
     */
    boolean isSetProcedureDataSet();

    /**
     * Returns the value of the '<em><b>Switching Plan</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getWorkTasks <em>Work Tasks</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_SwitchingPlan()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.SwitchingPlan' kind='element'"
     * @generated
     */
    SwitchingPlan getSwitchingPlan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    void unsetSwitchingPlan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference is set.
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
     * Returns the value of the '<em><b>Work</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work</em>' reference.
     * @see #isSetWork()
     * @see #unsetWork()
     * @see #setWork(Work)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_Work()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.Work' kind='element'"
     * @generated
     */
    Work getWork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork <em>Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work</em>' reference.
     * @see #isSetWork()
     * @see #unsetWork()
     * @see #getWork()
     * @generated
     */
    void setWork( Work value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork <em>Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWork()
     * @see #getWork()
     * @see #setWork(Work)
     * @generated
     */
    void unsetWork();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork <em>Work</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work</em>' reference is set.
     * @see #unsetWork()
     * @see #getWork()
     * @see #setWork(Work)
     * @generated
     */
    boolean isSetWork();

    /**
     * Returns the value of the '<em><b>Assets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assets</em>' reference list.
     * @see #isSetAssets()
     * @see #unsetAssets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_Assets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.Assets' kind='element'"
     * @generated
     */
    EList< Asset > getAssets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getAssets <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssets()
     * @see #getAssets()
     * @generated
     */
    void unsetAssets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getAssets <em>Assets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Assets</em>' reference list is set.
     * @see #unsetAssets()
     * @see #getAssets()
     * @generated
     */
    boolean isSetAssets();

    /**
     * Returns the value of the '<em><b>Crews</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crews</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crews</em>' reference list.
     * @see #isSetCrews()
     * @see #unsetCrews()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_Crews()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.Crews' kind='element'"
     * @generated
     */
    EList< Crew > getCrews();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrews <em>Crews</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrews()
     * @see #getCrews()
     * @generated
     */
    void unsetCrews();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getCrews <em>Crews</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crews</em>' reference list is set.
     * @see #unsetCrews()
     * @see #getCrews()
     * @generated
     */
    boolean isSetCrews();

    /**
     * Returns the value of the '<em><b>Material Items</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaterialItem}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaterialItem#getWorkTask <em>Work Task</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Material Items</em>' reference list.
     * @see #isSetMaterialItems()
     * @see #unsetMaterialItems()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTask_MaterialItems()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaterialItem#getWorkTask
     * @model opposite="WorkTask" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WorkTask.MaterialItems' kind='element'"
     * @generated
     */
    EList< MaterialItem > getMaterialItems();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMaterialItems <em>Material Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaterialItems()
     * @see #getMaterialItems()
     * @generated
     */
    void unsetMaterialItems();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getMaterialItems <em>Material Items</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Material Items</em>' reference list is set.
     * @see #unsetMaterialItems()
     * @see #getMaterialItems()
     * @generated
     */
    boolean isSetMaterialItems();

} // WorkTask
