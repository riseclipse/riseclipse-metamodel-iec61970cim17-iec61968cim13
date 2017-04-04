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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnosis Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getEffect <em>Effect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCode <em>Final Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet()
 * @model
 * @generated
 */
public interface DiagnosisDataSet extends ProcedureDataSet {
    /**
     * Returns the value of the '<em><b>Effect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effect</em>' attribute.
     * @see #isSetEffect()
     * @see #unsetEffect()
     * @see #setEffect(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_Effect()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.effect' kind='element'"
     * @generated
     */
    String getEffect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effect</em>' attribute.
     * @see #isSetEffect()
     * @see #unsetEffect()
     * @see #getEffect()
     * @generated
     */
    void setEffect( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEffect()
     * @see #getEffect()
     * @see #setEffect(String)
     * @generated
     */
    void unsetEffect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Effect</em>' attribute is set.
     * @see #unsetEffect()
     * @see #getEffect()
     * @see #setEffect(String)
     * @generated
     */
    boolean isSetEffect();

    /**
     * Returns the value of the '<em><b>Failure Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Failure Mode</em>' attribute.
     * @see #isSetFailureMode()
     * @see #unsetFailureMode()
     * @see #setFailureMode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_FailureMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.failureMode' kind='element'"
     * @generated
     */
    String getFailureMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure Mode</em>' attribute.
     * @see #isSetFailureMode()
     * @see #unsetFailureMode()
     * @see #getFailureMode()
     * @generated
     */
    void setFailureMode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailureMode()
     * @see #getFailureMode()
     * @see #setFailureMode(String)
     * @generated
     */
    void unsetFailureMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure Mode</em>' attribute is set.
     * @see #unsetFailureMode()
     * @see #getFailureMode()
     * @see #setFailureMode(String)
     * @generated
     */
    boolean isSetFailureMode();

    /**
     * Returns the value of the '<em><b>Final Cause</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final Cause</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final Cause</em>' attribute.
     * @see #isSetFinalCause()
     * @see #unsetFinalCause()
     * @see #setFinalCause(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_FinalCause()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.finalCause' kind='element'"
     * @generated
     */
    String getFinalCause();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final Cause</em>' attribute.
     * @see #isSetFinalCause()
     * @see #unsetFinalCause()
     * @see #getFinalCause()
     * @generated
     */
    void setFinalCause( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinalCause()
     * @see #getFinalCause()
     * @see #setFinalCause(String)
     * @generated
     */
    void unsetFinalCause();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Final Cause</em>' attribute is set.
     * @see #unsetFinalCause()
     * @see #getFinalCause()
     * @see #setFinalCause(String)
     * @generated
     */
    boolean isSetFinalCause();

    /**
     * Returns the value of the '<em><b>Final Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final Code</em>' attribute.
     * @see #isSetFinalCode()
     * @see #unsetFinalCode()
     * @see #setFinalCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_FinalCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.finalCode' kind='element'"
     * @generated
     */
    String getFinalCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final Code</em>' attribute.
     * @see #isSetFinalCode()
     * @see #unsetFinalCode()
     * @see #getFinalCode()
     * @generated
     */
    void setFinalCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinalCode()
     * @see #getFinalCode()
     * @see #setFinalCode(String)
     * @generated
     */
    void unsetFinalCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Final Code</em>' attribute is set.
     * @see #unsetFinalCode()
     * @see #getFinalCode()
     * @see #setFinalCode(String)
     * @generated
     */
    boolean isSetFinalCode();

    /**
     * Returns the value of the '<em><b>Final Origin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final Origin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final Origin</em>' attribute.
     * @see #isSetFinalOrigin()
     * @see #unsetFinalOrigin()
     * @see #setFinalOrigin(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_FinalOrigin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.finalOrigin' kind='element'"
     * @generated
     */
    String getFinalOrigin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final Origin</em>' attribute.
     * @see #isSetFinalOrigin()
     * @see #unsetFinalOrigin()
     * @see #getFinalOrigin()
     * @generated
     */
    void setFinalOrigin( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinalOrigin()
     * @see #getFinalOrigin()
     * @see #setFinalOrigin(String)
     * @generated
     */
    void unsetFinalOrigin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Final Origin</em>' attribute is set.
     * @see #unsetFinalOrigin()
     * @see #getFinalOrigin()
     * @see #setFinalOrigin(String)
     * @generated
     */
    boolean isSetFinalOrigin();

    /**
     * Returns the value of the '<em><b>Final Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final Remark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final Remark</em>' attribute.
     * @see #isSetFinalRemark()
     * @see #unsetFinalRemark()
     * @see #setFinalRemark(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_FinalRemark()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.finalRemark' kind='element'"
     * @generated
     */
    String getFinalRemark();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final Remark</em>' attribute.
     * @see #isSetFinalRemark()
     * @see #unsetFinalRemark()
     * @see #getFinalRemark()
     * @generated
     */
    void setFinalRemark( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinalRemark()
     * @see #getFinalRemark()
     * @see #setFinalRemark(String)
     * @generated
     */
    void unsetFinalRemark();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Final Remark</em>' attribute is set.
     * @see #unsetFinalRemark()
     * @see #getFinalRemark()
     * @see #setFinalRemark(String)
     * @generated
     */
    boolean isSetFinalRemark();

    /**
     * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Code</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhaseCode()
     * @see #unsetPhaseCode()
     * @see #setPhaseCode(PhaseCode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_PhaseCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.phaseCode' kind='element'"
     * @generated
     */
    PhaseCode getPhaseCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Code</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhaseCode()
     * @see #unsetPhaseCode()
     * @see #getPhaseCode()
     * @generated
     */
    void setPhaseCode( PhaseCode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseCode()
     * @see #getPhaseCode()
     * @see #setPhaseCode(PhaseCode)
     * @generated
     */
    void unsetPhaseCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Code</em>' attribute is set.
     * @see #unsetPhaseCode()
     * @see #getPhaseCode()
     * @see #setPhaseCode(PhaseCode)
     * @generated
     */
    boolean isSetPhaseCode();

    /**
     * Returns the value of the '<em><b>Preliminary Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preliminary Code</em>' attribute.
     * @see #isSetPreliminaryCode()
     * @see #unsetPreliminaryCode()
     * @see #setPreliminaryCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_PreliminaryCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.preliminaryCode' kind='element'"
     * @generated
     */
    String getPreliminaryCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preliminary Code</em>' attribute.
     * @see #isSetPreliminaryCode()
     * @see #unsetPreliminaryCode()
     * @see #getPreliminaryCode()
     * @generated
     */
    void setPreliminaryCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPreliminaryCode()
     * @see #getPreliminaryCode()
     * @see #setPreliminaryCode(String)
     * @generated
     */
    void unsetPreliminaryCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Preliminary Code</em>' attribute is set.
     * @see #unsetPreliminaryCode()
     * @see #getPreliminaryCode()
     * @see #setPreliminaryCode(String)
     * @generated
     */
    boolean isSetPreliminaryCode();

    /**
     * Returns the value of the '<em><b>Preliminary Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preliminary Date Time</em>' attribute.
     * @see #isSetPreliminaryDateTime()
     * @see #unsetPreliminaryDateTime()
     * @see #setPreliminaryDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_PreliminaryDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.preliminaryDateTime' kind='element'"
     * @generated
     */
    Date getPreliminaryDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preliminary Date Time</em>' attribute.
     * @see #isSetPreliminaryDateTime()
     * @see #unsetPreliminaryDateTime()
     * @see #getPreliminaryDateTime()
     * @generated
     */
    void setPreliminaryDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPreliminaryDateTime()
     * @see #getPreliminaryDateTime()
     * @see #setPreliminaryDateTime(Date)
     * @generated
     */
    void unsetPreliminaryDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Preliminary Date Time</em>' attribute is set.
     * @see #unsetPreliminaryDateTime()
     * @see #getPreliminaryDateTime()
     * @see #setPreliminaryDateTime(Date)
     * @generated
     */
    boolean isSetPreliminaryDateTime();

    /**
     * Returns the value of the '<em><b>Preliminary Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary Remark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preliminary Remark</em>' attribute.
     * @see #isSetPreliminaryRemark()
     * @see #unsetPreliminaryRemark()
     * @see #setPreliminaryRemark(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_PreliminaryRemark()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.preliminaryRemark' kind='element'"
     * @generated
     */
    String getPreliminaryRemark();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preliminary Remark</em>' attribute.
     * @see #isSetPreliminaryRemark()
     * @see #unsetPreliminaryRemark()
     * @see #getPreliminaryRemark()
     * @generated
     */
    void setPreliminaryRemark( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPreliminaryRemark()
     * @see #getPreliminaryRemark()
     * @see #setPreliminaryRemark(String)
     * @generated
     */
    void unsetPreliminaryRemark();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Preliminary Remark</em>' attribute is set.
     * @see #unsetPreliminaryRemark()
     * @see #getPreliminaryRemark()
     * @see #setPreliminaryRemark(String)
     * @generated
     */
    boolean isSetPreliminaryRemark();

    /**
     * Returns the value of the '<em><b>Root Cause</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Cause</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Cause</em>' attribute.
     * @see #isSetRootCause()
     * @see #unsetRootCause()
     * @see #setRootCause(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_RootCause()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.rootCause' kind='element'"
     * @generated
     */
    String getRootCause();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Cause</em>' attribute.
     * @see #isSetRootCause()
     * @see #unsetRootCause()
     * @see #getRootCause()
     * @generated
     */
    void setRootCause( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRootCause()
     * @see #getRootCause()
     * @see #setRootCause(String)
     * @generated
     */
    void unsetRootCause();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Root Cause</em>' attribute is set.
     * @see #unsetRootCause()
     * @see #getRootCause()
     * @see #setRootCause(String)
     * @generated
     */
    boolean isSetRootCause();

    /**
     * Returns the value of the '<em><b>Root Origin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Origin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Origin</em>' attribute.
     * @see #isSetRootOrigin()
     * @see #unsetRootOrigin()
     * @see #setRootOrigin(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_RootOrigin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.rootOrigin' kind='element'"
     * @generated
     */
    String getRootOrigin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Origin</em>' attribute.
     * @see #isSetRootOrigin()
     * @see #unsetRootOrigin()
     * @see #getRootOrigin()
     * @generated
     */
    void setRootOrigin( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRootOrigin()
     * @see #getRootOrigin()
     * @see #setRootOrigin(String)
     * @generated
     */
    void unsetRootOrigin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Root Origin</em>' attribute is set.
     * @see #unsetRootOrigin()
     * @see #getRootOrigin()
     * @see #setRootOrigin(String)
     * @generated
     */
    boolean isSetRootOrigin();

    /**
     * Returns the value of the '<em><b>Root Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Remark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Remark</em>' attribute.
     * @see #isSetRootRemark()
     * @see #unsetRootRemark()
     * @see #setRootRemark(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagnosisDataSet_RootRemark()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagnosisDataSet.rootRemark' kind='element'"
     * @generated
     */
    String getRootRemark();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Remark</em>' attribute.
     * @see #isSetRootRemark()
     * @see #unsetRootRemark()
     * @see #getRootRemark()
     * @generated
     */
    void setRootRemark( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRootRemark()
     * @see #getRootRemark()
     * @see #setRootRemark(String)
     * @generated
     */
    void unsetRootRemark();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Root Remark</em>' attribute is set.
     * @see #unsetRootRemark()
     * @see #getRootRemark()
     * @see #setRootRemark(String)
     * @generated
     */
    boolean isSetRootRemark();

} // DiagnosisDataSet
