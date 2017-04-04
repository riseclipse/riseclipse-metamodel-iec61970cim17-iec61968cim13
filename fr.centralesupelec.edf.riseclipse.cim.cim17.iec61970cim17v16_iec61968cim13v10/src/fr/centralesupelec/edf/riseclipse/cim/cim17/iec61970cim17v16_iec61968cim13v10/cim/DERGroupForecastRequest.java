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
 * A representation of the model object '<em><b>DER Group Forecast Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getCapabilityKind <em>Capability Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastBeginDate <em>Forecast Begin Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastInterval <em>Forecast Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastIntervalQty <em>Forecast Interval Qty</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecastRequest()
 * @model
 * @generated
 */
public interface DERGroupForecastRequest extends IdentifiedObject {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecastRequest_CapabilityKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecastRequest.capabilityKind' kind='element'"
     * @generated
     */
    CapabilityKind getCapabilityKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getCapabilityKind <em>Capability Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getCapabilityKind <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityKind()
     * @see #getCapabilityKind()
     * @see #setCapabilityKind(CapabilityKind)
     * @generated
     */
    void unsetCapabilityKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getCapabilityKind <em>Capability Kind</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Forecast Begin Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Forecast Begin Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Forecast Begin Date</em>' attribute.
     * @see #isSetForecastBeginDate()
     * @see #unsetForecastBeginDate()
     * @see #setForecastBeginDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecastRequest_ForecastBeginDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecastRequest.forecastBeginDate' kind='element'"
     * @generated
     */
    Date getForecastBeginDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastBeginDate <em>Forecast Begin Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Forecast Begin Date</em>' attribute.
     * @see #isSetForecastBeginDate()
     * @see #unsetForecastBeginDate()
     * @see #getForecastBeginDate()
     * @generated
     */
    void setForecastBeginDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastBeginDate <em>Forecast Begin Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetForecastBeginDate()
     * @see #getForecastBeginDate()
     * @see #setForecastBeginDate(Date)
     * @generated
     */
    void unsetForecastBeginDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastBeginDate <em>Forecast Begin Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Forecast Begin Date</em>' attribute is set.
     * @see #unsetForecastBeginDate()
     * @see #getForecastBeginDate()
     * @see #setForecastBeginDate(Date)
     * @generated
     */
    boolean isSetForecastBeginDate();

    /**
     * Returns the value of the '<em><b>Forecast Interval</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Forecast Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Forecast Interval</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind
     * @see #isSetForecastInterval()
     * @see #unsetForecastInterval()
     * @see #setForecastInterval(PredictionIntervalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecastRequest_ForecastInterval()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecastRequest.forecastInterval' kind='element'"
     * @generated
     */
    PredictionIntervalKind getForecastInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastInterval <em>Forecast Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Forecast Interval</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind
     * @see #isSetForecastInterval()
     * @see #unsetForecastInterval()
     * @see #getForecastInterval()
     * @generated
     */
    void setForecastInterval( PredictionIntervalKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastInterval <em>Forecast Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetForecastInterval()
     * @see #getForecastInterval()
     * @see #setForecastInterval(PredictionIntervalKind)
     * @generated
     */
    void unsetForecastInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastInterval <em>Forecast Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Forecast Interval</em>' attribute is set.
     * @see #unsetForecastInterval()
     * @see #getForecastInterval()
     * @see #setForecastInterval(PredictionIntervalKind)
     * @generated
     */
    boolean isSetForecastInterval();

    /**
     * Returns the value of the '<em><b>Forecast Interval Qty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Forecast Interval Qty</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Forecast Interval Qty</em>' attribute.
     * @see #isSetForecastIntervalQty()
     * @see #unsetForecastIntervalQty()
     * @see #setForecastIntervalQty(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupForecastRequest_ForecastIntervalQty()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupForecastRequest.forecastIntervalQty' kind='element'"
     * @generated
     */
    Integer getForecastIntervalQty();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastIntervalQty <em>Forecast Interval Qty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Forecast Interval Qty</em>' attribute.
     * @see #isSetForecastIntervalQty()
     * @see #unsetForecastIntervalQty()
     * @see #getForecastIntervalQty()
     * @generated
     */
    void setForecastIntervalQty( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastIntervalQty <em>Forecast Interval Qty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetForecastIntervalQty()
     * @see #getForecastIntervalQty()
     * @see #setForecastIntervalQty(Integer)
     * @generated
     */
    void unsetForecastIntervalQty();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest#getForecastIntervalQty <em>Forecast Interval Qty</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Forecast Interval Qty</em>' attribute is set.
     * @see #unsetForecastIntervalQty()
     * @see #getForecastIntervalQty()
     * @see #setForecastIntervalQty(Integer)
     * @generated
     */
    boolean isSetForecastIntervalQty();

} // DERGroupForecastRequest
