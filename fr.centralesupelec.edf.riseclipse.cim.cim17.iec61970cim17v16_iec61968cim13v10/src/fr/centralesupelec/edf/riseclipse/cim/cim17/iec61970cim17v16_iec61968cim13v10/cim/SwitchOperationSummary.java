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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Operation Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeFaultOperations <em>Lifetime Fault Operations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeMotorStarts <em>Lifetime Motor Starts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeTotalOperations <em>Lifetime Total Operations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentFaultOperationDate <em>Most Recent Fault Operation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentMotorStartDate <em>Most Recent Motor Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentOperationDate <em>Most Recent Operation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker <em>Breaker</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary()
 * @model
 * @generated
 */
public interface SwitchOperationSummary extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Lifetime Fault Operations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifetime Fault Operations</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifetime Fault Operations</em>' attribute.
     * @see #isSetLifetimeFaultOperations()
     * @see #unsetLifetimeFaultOperations()
     * @see #setLifetimeFaultOperations(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_LifetimeFaultOperations()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.lifetimeFaultOperations' kind='element'"
     * @generated
     */
    Integer getLifetimeFaultOperations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeFaultOperations <em>Lifetime Fault Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifetime Fault Operations</em>' attribute.
     * @see #isSetLifetimeFaultOperations()
     * @see #unsetLifetimeFaultOperations()
     * @see #getLifetimeFaultOperations()
     * @generated
     */
    void setLifetimeFaultOperations( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeFaultOperations <em>Lifetime Fault Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLifetimeFaultOperations()
     * @see #getLifetimeFaultOperations()
     * @see #setLifetimeFaultOperations(Integer)
     * @generated
     */
    void unsetLifetimeFaultOperations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeFaultOperations <em>Lifetime Fault Operations</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lifetime Fault Operations</em>' attribute is set.
     * @see #unsetLifetimeFaultOperations()
     * @see #getLifetimeFaultOperations()
     * @see #setLifetimeFaultOperations(Integer)
     * @generated
     */
    boolean isSetLifetimeFaultOperations();

    /**
     * Returns the value of the '<em><b>Lifetime Motor Starts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifetime Motor Starts</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifetime Motor Starts</em>' attribute.
     * @see #isSetLifetimeMotorStarts()
     * @see #unsetLifetimeMotorStarts()
     * @see #setLifetimeMotorStarts(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_LifetimeMotorStarts()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.lifetimeMotorStarts' kind='element'"
     * @generated
     */
    Integer getLifetimeMotorStarts();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeMotorStarts <em>Lifetime Motor Starts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifetime Motor Starts</em>' attribute.
     * @see #isSetLifetimeMotorStarts()
     * @see #unsetLifetimeMotorStarts()
     * @see #getLifetimeMotorStarts()
     * @generated
     */
    void setLifetimeMotorStarts( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeMotorStarts <em>Lifetime Motor Starts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLifetimeMotorStarts()
     * @see #getLifetimeMotorStarts()
     * @see #setLifetimeMotorStarts(Integer)
     * @generated
     */
    void unsetLifetimeMotorStarts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeMotorStarts <em>Lifetime Motor Starts</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lifetime Motor Starts</em>' attribute is set.
     * @see #unsetLifetimeMotorStarts()
     * @see #getLifetimeMotorStarts()
     * @see #setLifetimeMotorStarts(Integer)
     * @generated
     */
    boolean isSetLifetimeMotorStarts();

    /**
     * Returns the value of the '<em><b>Lifetime Total Operations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifetime Total Operations</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifetime Total Operations</em>' attribute.
     * @see #isSetLifetimeTotalOperations()
     * @see #unsetLifetimeTotalOperations()
     * @see #setLifetimeTotalOperations(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_LifetimeTotalOperations()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.lifetimeTotalOperations' kind='element'"
     * @generated
     */
    Integer getLifetimeTotalOperations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeTotalOperations <em>Lifetime Total Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifetime Total Operations</em>' attribute.
     * @see #isSetLifetimeTotalOperations()
     * @see #unsetLifetimeTotalOperations()
     * @see #getLifetimeTotalOperations()
     * @generated
     */
    void setLifetimeTotalOperations( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeTotalOperations <em>Lifetime Total Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLifetimeTotalOperations()
     * @see #getLifetimeTotalOperations()
     * @see #setLifetimeTotalOperations(Integer)
     * @generated
     */
    void unsetLifetimeTotalOperations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getLifetimeTotalOperations <em>Lifetime Total Operations</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lifetime Total Operations</em>' attribute is set.
     * @see #unsetLifetimeTotalOperations()
     * @see #getLifetimeTotalOperations()
     * @see #setLifetimeTotalOperations(Integer)
     * @generated
     */
    boolean isSetLifetimeTotalOperations();

    /**
     * Returns the value of the '<em><b>Most Recent Fault Operation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Most Recent Fault Operation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Most Recent Fault Operation Date</em>' attribute.
     * @see #isSetMostRecentFaultOperationDate()
     * @see #unsetMostRecentFaultOperationDate()
     * @see #setMostRecentFaultOperationDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_MostRecentFaultOperationDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.mostRecentFaultOperationDate' kind='element'"
     * @generated
     */
    Date getMostRecentFaultOperationDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentFaultOperationDate <em>Most Recent Fault Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Most Recent Fault Operation Date</em>' attribute.
     * @see #isSetMostRecentFaultOperationDate()
     * @see #unsetMostRecentFaultOperationDate()
     * @see #getMostRecentFaultOperationDate()
     * @generated
     */
    void setMostRecentFaultOperationDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentFaultOperationDate <em>Most Recent Fault Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMostRecentFaultOperationDate()
     * @see #getMostRecentFaultOperationDate()
     * @see #setMostRecentFaultOperationDate(Date)
     * @generated
     */
    void unsetMostRecentFaultOperationDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentFaultOperationDate <em>Most Recent Fault Operation Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Most Recent Fault Operation Date</em>' attribute is set.
     * @see #unsetMostRecentFaultOperationDate()
     * @see #getMostRecentFaultOperationDate()
     * @see #setMostRecentFaultOperationDate(Date)
     * @generated
     */
    boolean isSetMostRecentFaultOperationDate();

    /**
     * Returns the value of the '<em><b>Most Recent Motor Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Most Recent Motor Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Most Recent Motor Start Date</em>' attribute.
     * @see #isSetMostRecentMotorStartDate()
     * @see #unsetMostRecentMotorStartDate()
     * @see #setMostRecentMotorStartDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_MostRecentMotorStartDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.mostRecentMotorStartDate' kind='element'"
     * @generated
     */
    Date getMostRecentMotorStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentMotorStartDate <em>Most Recent Motor Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Most Recent Motor Start Date</em>' attribute.
     * @see #isSetMostRecentMotorStartDate()
     * @see #unsetMostRecentMotorStartDate()
     * @see #getMostRecentMotorStartDate()
     * @generated
     */
    void setMostRecentMotorStartDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentMotorStartDate <em>Most Recent Motor Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMostRecentMotorStartDate()
     * @see #getMostRecentMotorStartDate()
     * @see #setMostRecentMotorStartDate(Date)
     * @generated
     */
    void unsetMostRecentMotorStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentMotorStartDate <em>Most Recent Motor Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Most Recent Motor Start Date</em>' attribute is set.
     * @see #unsetMostRecentMotorStartDate()
     * @see #getMostRecentMotorStartDate()
     * @see #setMostRecentMotorStartDate(Date)
     * @generated
     */
    boolean isSetMostRecentMotorStartDate();

    /**
     * Returns the value of the '<em><b>Most Recent Operation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Most Recent Operation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Most Recent Operation Date</em>' attribute.
     * @see #isSetMostRecentOperationDate()
     * @see #unsetMostRecentOperationDate()
     * @see #setMostRecentOperationDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_MostRecentOperationDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.mostRecentOperationDate' kind='element'"
     * @generated
     */
    Date getMostRecentOperationDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentOperationDate <em>Most Recent Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Most Recent Operation Date</em>' attribute.
     * @see #isSetMostRecentOperationDate()
     * @see #unsetMostRecentOperationDate()
     * @see #getMostRecentOperationDate()
     * @generated
     */
    void setMostRecentOperationDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentOperationDate <em>Most Recent Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMostRecentOperationDate()
     * @see #getMostRecentOperationDate()
     * @see #setMostRecentOperationDate(Date)
     * @generated
     */
    void unsetMostRecentOperationDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getMostRecentOperationDate <em>Most Recent Operation Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Most Recent Operation Date</em>' attribute is set.
     * @see #unsetMostRecentOperationDate()
     * @see #getMostRecentOperationDate()
     * @see #setMostRecentOperationDate(Date)
     * @generated
     */
    boolean isSetMostRecentOperationDate();

    /**
     * Returns the value of the '<em><b>Breaker</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation <em>Breaker Operation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker</em>' reference.
     * @see #isSetBreaker()
     * @see #unsetBreaker()
     * @see #setBreaker(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchOperationSummary_Breaker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation
     * @model opposite="BreakerOperation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchOperationSummary.Breaker' kind='element'"
     * @generated
     */
    Asset getBreaker();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker <em>Breaker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker</em>' reference.
     * @see #isSetBreaker()
     * @see #unsetBreaker()
     * @see #getBreaker()
     * @generated
     */
    void setBreaker( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker <em>Breaker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreaker()
     * @see #getBreaker()
     * @see #setBreaker(Asset)
     * @generated
     */
    void unsetBreaker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker <em>Breaker</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker</em>' reference is set.
     * @see #unsetBreaker()
     * @see #getBreaker()
     * @see #setBreaker(Asset)
     * @generated
     */
    boolean isSetBreaker();

} // SwitchOperationSummary
