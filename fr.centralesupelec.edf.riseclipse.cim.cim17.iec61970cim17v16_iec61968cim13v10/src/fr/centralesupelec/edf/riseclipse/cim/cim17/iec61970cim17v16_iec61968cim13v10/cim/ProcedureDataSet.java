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
 * A representation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset <em>Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet()
 * @model
 * @generated
 */
public interface ProcedureDataSet extends Document {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_CompletedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.completedDateTime' kind='element'"
     * @generated
     */
    Date getCompletedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @generated
     */
    void unsetCompletedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedureDataSet <em>Procedure Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #setAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedureDataSet
     * @model opposite="ProcedureDataSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.Asset' kind='element'"
     * @generated
     */
    Asset getAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    void setAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset <em>Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    boolean isSetAsset();

    /**
     * Returns the value of the '<em><b>Measurement Value</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getProcedureDataSet <em>Procedure Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Value</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Value</em>' reference list.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_MeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getProcedureDataSet
     * @model opposite="ProcedureDataSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.MeasurementValue' kind='element'"
     * @generated
     */
    EList< MeasurementValue > getMeasurementValue();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getMeasurementValue <em>Measurement Value</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValue()
     * @see #getMeasurementValue()
     * @generated
     */
    void unsetMeasurementValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getMeasurementValue <em>Measurement Value</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value</em>' reference list is set.
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @generated
     */
    boolean isSetMeasurementValue();

    /**
     * Returns the value of the '<em><b>Procedure</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure</em>' reference.
     * @see #isSetProcedure()
     * @see #unsetProcedure()
     * @see #setProcedure(Procedure)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_Procedure()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure#getProcedureDataSets
     * @model opposite="ProcedureDataSets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.Procedure' kind='element'"
     * @generated
     */
    Procedure getProcedure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Procedure</em>' reference.
     * @see #isSetProcedure()
     * @see #unsetProcedure()
     * @see #getProcedure()
     * @generated
     */
    void setProcedure( Procedure value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedure()
     * @see #getProcedure()
     * @see #setProcedure(Procedure)
     * @generated
     */
    void unsetProcedure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedure</em>' reference is set.
     * @see #unsetProcedure()
     * @see #getProcedure()
     * @see #setProcedure(Procedure)
     * @generated
     */
    boolean isSetProcedure();

    /**
     * Returns the value of the '<em><b>Work Task</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getProcedureDataSet <em>Procedure Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Task</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Task</em>' reference.
     * @see #isSetWorkTask()
     * @see #unsetWorkTask()
     * @see #setWorkTask(WorkTask)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_WorkTask()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getProcedureDataSet
     * @model opposite="ProcedureDataSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.WorkTask' kind='element'"
     * @generated
     */
    WorkTask getWorkTask();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask <em>Work Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Task</em>' reference.
     * @see #isSetWorkTask()
     * @see #unsetWorkTask()
     * @see #getWorkTask()
     * @generated
     */
    void setWorkTask( WorkTask value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask <em>Work Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkTask()
     * @see #getWorkTask()
     * @see #setWorkTask(WorkTask)
     * @generated
     */
    void unsetWorkTask();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getWorkTask <em>Work Task</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Task</em>' reference is set.
     * @see #unsetWorkTask()
     * @see #getWorkTask()
     * @see #setWorkTask(WorkTask)
     * @generated
     */
    boolean isSetWorkTask();

    /**
     * Returns the value of the '<em><b>Properties</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' reference list.
     * @see #isSetProperties()
     * @see #unsetProperties()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureDataSet_Properties()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute#getProcedureDataSets
     * @model opposite="ProcedureDataSets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProcedureDataSet.Properties' kind='element'"
     * @generated
     */
    EList< UserAttribute > getProperties();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProperties <em>Properties</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProperties()
     * @see #getProperties()
     * @generated
     */
    void unsetProperties();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getProperties <em>Properties</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Properties</em>' reference list is set.
     * @see #unsetProperties()
     * @see #getProperties()
     * @generated
     */
    boolean isSetProperties();

} // ProcedureDataSet
