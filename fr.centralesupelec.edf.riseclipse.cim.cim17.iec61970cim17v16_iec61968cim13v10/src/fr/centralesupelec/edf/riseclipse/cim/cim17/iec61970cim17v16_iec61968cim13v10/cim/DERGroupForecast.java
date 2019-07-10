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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DER Group Forecast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getCapabilityKind <em>Capability Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionCreationDate <em>Prediction Creation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionIntervalKind <em>Prediction Interval Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionStartDate <em>Prediction Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictions <em>Predictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getEndDeviceGroup <em>End Device Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast()
 * @model
 * @generated
 */
public interface DERGroupForecast extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Capability Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CapabilityKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CapabilityKind
     * @see #isSetCapabilityKind()
     * @see #unsetCapabilityKind()
     * @see #setCapabilityKind(CapabilityKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_CapabilityKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.capabilityKind' kind='element'"
     * @generated
     */
    CapabilityKind getCapabilityKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getCapabilityKind <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CapabilityKind
     * @see #isSetCapabilityKind()
     * @see #unsetCapabilityKind()
     * @see #getCapabilityKind()
     * @generated
     */
    void setCapabilityKind( CapabilityKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getCapabilityKind <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityKind()
     * @see #getCapabilityKind()
     * @see #setCapabilityKind(CapabilityKind)
     * @generated
     */
    void unsetCapabilityKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getCapabilityKind <em>Capability Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Kind</em>' attribute is set.
     * @see #unsetCapabilityKind()
     * @see #getCapabilityKind()
     * @see #setCapabilityKind(CapabilityKind)
     * @generated
     */
    boolean isSetCapabilityKind();

    /**
     * Returns the value of the '<em><b>Prediction Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prediction Creation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prediction Creation Date</em>' attribute.
     * @see #isSetPredictionCreationDate()
     * @see #unsetPredictionCreationDate()
     * @see #setPredictionCreationDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_PredictionCreationDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.predictionCreationDate' kind='element'"
     * @generated
     */
    Date getPredictionCreationDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionCreationDate <em>Prediction Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prediction Creation Date</em>' attribute.
     * @see #isSetPredictionCreationDate()
     * @see #unsetPredictionCreationDate()
     * @see #getPredictionCreationDate()
     * @generated
     */
    void setPredictionCreationDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionCreationDate <em>Prediction Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredictionCreationDate()
     * @see #getPredictionCreationDate()
     * @see #setPredictionCreationDate(Date)
     * @generated
     */
    void unsetPredictionCreationDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionCreationDate <em>Prediction Creation Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prediction Creation Date</em>' attribute is set.
     * @see #unsetPredictionCreationDate()
     * @see #getPredictionCreationDate()
     * @see #setPredictionCreationDate(Date)
     * @generated
     */
    boolean isSetPredictionCreationDate();

    /**
     * Returns the value of the '<em><b>Prediction Interval Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prediction Interval Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prediction Interval Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind
     * @see #isSetPredictionIntervalKind()
     * @see #unsetPredictionIntervalKind()
     * @see #setPredictionIntervalKind(PredictionIntervalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_PredictionIntervalKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.predictionIntervalKind' kind='element'"
     * @generated
     */
    PredictionIntervalKind getPredictionIntervalKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionIntervalKind <em>Prediction Interval Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prediction Interval Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind
     * @see #isSetPredictionIntervalKind()
     * @see #unsetPredictionIntervalKind()
     * @see #getPredictionIntervalKind()
     * @generated
     */
    void setPredictionIntervalKind( PredictionIntervalKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionIntervalKind <em>Prediction Interval Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredictionIntervalKind()
     * @see #getPredictionIntervalKind()
     * @see #setPredictionIntervalKind(PredictionIntervalKind)
     * @generated
     */
    void unsetPredictionIntervalKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionIntervalKind <em>Prediction Interval Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prediction Interval Kind</em>' attribute is set.
     * @see #unsetPredictionIntervalKind()
     * @see #getPredictionIntervalKind()
     * @see #setPredictionIntervalKind(PredictionIntervalKind)
     * @generated
     */
    boolean isSetPredictionIntervalKind();

    /**
     * Returns the value of the '<em><b>Prediction Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prediction Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prediction Start Date</em>' attribute.
     * @see #isSetPredictionStartDate()
     * @see #unsetPredictionStartDate()
     * @see #setPredictionStartDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_PredictionStartDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.predictionStartDate' kind='element'"
     * @generated
     */
    Date getPredictionStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionStartDate <em>Prediction Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prediction Start Date</em>' attribute.
     * @see #isSetPredictionStartDate()
     * @see #unsetPredictionStartDate()
     * @see #getPredictionStartDate()
     * @generated
     */
    void setPredictionStartDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionStartDate <em>Prediction Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredictionStartDate()
     * @see #getPredictionStartDate()
     * @see #setPredictionStartDate(Date)
     * @generated
     */
    void unsetPredictionStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictionStartDate <em>Prediction Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prediction Start Date</em>' attribute is set.
     * @see #unsetPredictionStartDate()
     * @see #getPredictionStartDate()
     * @see #setPredictionStartDate(Date)
     * @generated
     */
    boolean isSetPredictionStartDate();

    /**
     * Returns the value of the '<em><b>Predictions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getDERGroupForecast <em>DER Group Forecast</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Predictions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Predictions</em>' reference list.
     * @see #isSetPredictions()
     * @see #unsetPredictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_Predictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getDERGroupForecast
     * @model opposite="DERGroupForecast" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.Predictions' kind='element'"
     * @generated
     */
    EList< Predictions > getPredictions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictions <em>Predictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredictions()
     * @see #getPredictions()
     * @generated
     */
    void unsetPredictions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictions <em>Predictions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Predictions</em>' reference list is set.
     * @see #unsetPredictions()
     * @see #getPredictions()
     * @generated
     */
    boolean isSetPredictions();

    /**
     * Returns the value of the '<em><b>End Device Group</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDERGroupForecast <em>DER Group Forecast</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Group</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Group</em>' reference list.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecast_EndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDERGroupForecast
     * @model opposite="DERGroupForecast" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecast.EndDeviceGroup' kind='element'"
     * @generated
     */
    EList< EndDeviceGroup > getEndDeviceGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getEndDeviceGroup <em>End Device Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    void unsetEndDeviceGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getEndDeviceGroup <em>End Device Group</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Group</em>' reference list is set.
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    boolean isSetEndDeviceGroup();

} // DERGroupForecast
