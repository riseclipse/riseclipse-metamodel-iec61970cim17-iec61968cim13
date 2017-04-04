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
 * A representation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedDateTime <em>Released Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor <em>Issued By Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedBySupervisor <em>Released By Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor <em>Released To Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedToSupervisor <em>Issued To Supervisor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument()
 * @model
 * @generated
 */
public interface SafetyDocument extends Document {
    /**
     * Returns the value of the '<em><b>Issued Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issued Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issued Date Time</em>' attribute.
     * @see #isSetIssuedDateTime()
     * @see #unsetIssuedDateTime()
     * @see #setIssuedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_IssuedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.issuedDateTime' kind='element'"
     * @generated
     */
    Date getIssuedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedDateTime <em>Issued Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issued Date Time</em>' attribute.
     * @see #isSetIssuedDateTime()
     * @see #unsetIssuedDateTime()
     * @see #getIssuedDateTime()
     * @generated
     */
    void setIssuedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedDateTime <em>Issued Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuedDateTime()
     * @see #getIssuedDateTime()
     * @see #setIssuedDateTime(Date)
     * @generated
     */
    void unsetIssuedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedDateTime <em>Issued Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issued Date Time</em>' attribute is set.
     * @see #unsetIssuedDateTime()
     * @see #getIssuedDateTime()
     * @see #setIssuedDateTime(Date)
     * @generated
     */
    boolean isSetIssuedDateTime();

    /**
     * Returns the value of the '<em><b>Released Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Released Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Released Date Time</em>' attribute.
     * @see #isSetReleasedDateTime()
     * @see #unsetReleasedDateTime()
     * @see #setReleasedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_ReleasedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.releasedDateTime' kind='element'"
     * @generated
     */
    Date getReleasedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedDateTime <em>Released Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Released Date Time</em>' attribute.
     * @see #isSetReleasedDateTime()
     * @see #unsetReleasedDateTime()
     * @see #getReleasedDateTime()
     * @generated
     */
    void setReleasedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedDateTime <em>Released Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReleasedDateTime()
     * @see #getReleasedDateTime()
     * @see #setReleasedDateTime(Date)
     * @generated
     */
    void unsetReleasedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedDateTime <em>Released Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Released Date Time</em>' attribute is set.
     * @see #unsetReleasedDateTime()
     * @see #getReleasedDateTime()
     * @see #setReleasedDateTime(Date)
     * @generated
     */
    boolean isSetReleasedDateTime();

    /**
     * Returns the value of the '<em><b>Switching Plan</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSafetyDocuments <em>Safety Documents</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_SwitchingPlan()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan#getSafetyDocuments
     * @model opposite="SafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.SwitchingPlan' kind='element'"
     * @generated
     */
    SwitchingPlan getSwitchingPlan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    void unsetSwitchingPlan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference is set.
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
     * Returns the value of the '<em><b>Issued By Supervisor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issued By Supervisor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issued By Supervisor</em>' reference.
     * @see #isSetIssuedBySupervisor()
     * @see #unsetIssuedBySupervisor()
     * @see #setIssuedBySupervisor(OperationsSafetySupervisor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_IssuedBySupervisor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getIssuedSafetyDocuments
     * @model opposite="IssuedSafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.IssuedBySupervisor' kind='element'"
     * @generated
     */
    OperationsSafetySupervisor getIssuedBySupervisor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor <em>Issued By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issued By Supervisor</em>' reference.
     * @see #isSetIssuedBySupervisor()
     * @see #unsetIssuedBySupervisor()
     * @see #getIssuedBySupervisor()
     * @generated
     */
    void setIssuedBySupervisor( OperationsSafetySupervisor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor <em>Issued By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuedBySupervisor()
     * @see #getIssuedBySupervisor()
     * @see #setIssuedBySupervisor(OperationsSafetySupervisor)
     * @generated
     */
    void unsetIssuedBySupervisor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor <em>Issued By Supervisor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issued By Supervisor</em>' reference is set.
     * @see #unsetIssuedBySupervisor()
     * @see #getIssuedBySupervisor()
     * @see #setIssuedBySupervisor(OperationsSafetySupervisor)
     * @generated
     */
    boolean isSetIssuedBySupervisor();

    /**
     * Returns the value of the '<em><b>Released By Supervisor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FieldSafetySupervisor#getReleasedSafetyDocuments <em>Released Safety Documents</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Released By Supervisor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Released By Supervisor</em>' reference.
     * @see #isSetReleasedBySupervisor()
     * @see #unsetReleasedBySupervisor()
     * @see #setReleasedBySupervisor(FieldSafetySupervisor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_ReleasedBySupervisor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FieldSafetySupervisor#getReleasedSafetyDocuments
     * @model opposite="ReleasedSafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.ReleasedBySupervisor' kind='element'"
     * @generated
     */
    FieldSafetySupervisor getReleasedBySupervisor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedBySupervisor <em>Released By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Released By Supervisor</em>' reference.
     * @see #isSetReleasedBySupervisor()
     * @see #unsetReleasedBySupervisor()
     * @see #getReleasedBySupervisor()
     * @generated
     */
    void setReleasedBySupervisor( FieldSafetySupervisor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedBySupervisor <em>Released By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReleasedBySupervisor()
     * @see #getReleasedBySupervisor()
     * @see #setReleasedBySupervisor(FieldSafetySupervisor)
     * @generated
     */
    void unsetReleasedBySupervisor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedBySupervisor <em>Released By Supervisor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Released By Supervisor</em>' reference is set.
     * @see #unsetReleasedBySupervisor()
     * @see #getReleasedBySupervisor()
     * @see #setReleasedBySupervisor(FieldSafetySupervisor)
     * @generated
     */
    boolean isSetReleasedBySupervisor();

    /**
     * Returns the value of the '<em><b>Released To Supervisor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getReleasedSafetyDocuments <em>Released Safety Documents</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Released To Supervisor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Released To Supervisor</em>' reference.
     * @see #isSetReleasedToSupervisor()
     * @see #unsetReleasedToSupervisor()
     * @see #setReleasedToSupervisor(OperationsSafetySupervisor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_ReleasedToSupervisor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getReleasedSafetyDocuments
     * @model opposite="ReleasedSafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.ReleasedToSupervisor' kind='element'"
     * @generated
     */
    OperationsSafetySupervisor getReleasedToSupervisor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor <em>Released To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Released To Supervisor</em>' reference.
     * @see #isSetReleasedToSupervisor()
     * @see #unsetReleasedToSupervisor()
     * @see #getReleasedToSupervisor()
     * @generated
     */
    void setReleasedToSupervisor( OperationsSafetySupervisor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor <em>Released To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReleasedToSupervisor()
     * @see #getReleasedToSupervisor()
     * @see #setReleasedToSupervisor(OperationsSafetySupervisor)
     * @generated
     */
    void unsetReleasedToSupervisor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor <em>Released To Supervisor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Released To Supervisor</em>' reference is set.
     * @see #unsetReleasedToSupervisor()
     * @see #getReleasedToSupervisor()
     * @see #setReleasedToSupervisor(OperationsSafetySupervisor)
     * @generated
     */
    boolean isSetReleasedToSupervisor();

    /**
     * Returns the value of the '<em><b>Issued To Supervisor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FieldSafetySupervisor#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issued To Supervisor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issued To Supervisor</em>' reference.
     * @see #isSetIssuedToSupervisor()
     * @see #unsetIssuedToSupervisor()
     * @see #setIssuedToSupervisor(FieldSafetySupervisor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSafetyDocument_IssuedToSupervisor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FieldSafetySupervisor#getIssuedSafetyDocuments
     * @model opposite="IssuedSafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SafetyDocument.IssuedToSupervisor' kind='element'"
     * @generated
     */
    FieldSafetySupervisor getIssuedToSupervisor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedToSupervisor <em>Issued To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issued To Supervisor</em>' reference.
     * @see #isSetIssuedToSupervisor()
     * @see #unsetIssuedToSupervisor()
     * @see #getIssuedToSupervisor()
     * @generated
     */
    void setIssuedToSupervisor( FieldSafetySupervisor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedToSupervisor <em>Issued To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuedToSupervisor()
     * @see #getIssuedToSupervisor()
     * @see #setIssuedToSupervisor(FieldSafetySupervisor)
     * @generated
     */
    void unsetIssuedToSupervisor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedToSupervisor <em>Issued To Supervisor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issued To Supervisor</em>' reference is set.
     * @see #unsetIssuedToSupervisor()
     * @see #getIssuedToSupervisor()
     * @see #setIssuedToSupervisor(FieldSafetySupervisor)
     * @generated
     */
    boolean isSetIssuedToSupervisor();

} // SafetyDocument
