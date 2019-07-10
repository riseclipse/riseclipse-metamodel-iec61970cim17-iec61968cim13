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
 * A representation of the model object '<em><b>Predictions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxActivePower <em>Max Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxApparentPower <em>Max Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxReactivePower <em>Max Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinActivePower <em>Min Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinApparentPower <em>Min Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinReactivePower <em>Min Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getPredictionInterval <em>Prediction Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getOtherCapability <em>Other Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getDERGroupForecast <em>DER Group Forecast</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions()
 * @model
 * @generated
 */
public interface Predictions extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Confidence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confidence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Confidence</em>' attribute.
     * @see #isSetConfidence()
     * @see #unsetConfidence()
     * @see #setConfidence(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_Confidence()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.confidence' kind='element'"
     * @generated
     */
    Float getConfidence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getConfidence <em>Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confidence</em>' attribute.
     * @see #isSetConfidence()
     * @see #unsetConfidence()
     * @see #getConfidence()
     * @generated
     */
    void setConfidence( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getConfidence <em>Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfidence()
     * @see #getConfidence()
     * @see #setConfidence(Float)
     * @generated
     */
    void unsetConfidence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getConfidence <em>Confidence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Confidence</em>' attribute is set.
     * @see #unsetConfidence()
     * @see #getConfidence()
     * @see #setConfidence(Float)
     * @generated
     */
    boolean isSetConfidence();

    /**
     * Returns the value of the '<em><b>Max Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Active Power</em>' attribute.
     * @see #isSetMaxActivePower()
     * @see #unsetMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MaxActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.maxActivePower' kind='element'"
     * @generated
     */
    Float getMaxActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxActivePower <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Active Power</em>' attribute.
     * @see #isSetMaxActivePower()
     * @see #unsetMaxActivePower()
     * @see #getMaxActivePower()
     * @generated
     */
    void setMaxActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxActivePower <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxActivePower()
     * @see #getMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @generated
     */
    void unsetMaxActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxActivePower <em>Max Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Active Power</em>' attribute is set.
     * @see #unsetMaxActivePower()
     * @see #getMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @generated
     */
    boolean isSetMaxActivePower();

    /**
     * Returns the value of the '<em><b>Max Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Apparent Power</em>' attribute.
     * @see #isSetMaxApparentPower()
     * @see #unsetMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MaxApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.maxApparentPower' kind='element'"
     * @generated
     */
    Float getMaxApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxApparentPower <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Apparent Power</em>' attribute.
     * @see #isSetMaxApparentPower()
     * @see #unsetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @generated
     */
    void setMaxApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxApparentPower <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @generated
     */
    void unsetMaxApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxApparentPower <em>Max Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Apparent Power</em>' attribute is set.
     * @see #unsetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @generated
     */
    boolean isSetMaxApparentPower();

    /**
     * Returns the value of the '<em><b>Max Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Reactive Power</em>' attribute.
     * @see #isSetMaxReactivePower()
     * @see #unsetMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MaxReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.maxReactivePower' kind='element'"
     * @generated
     */
    Float getMaxReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxReactivePower <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Reactive Power</em>' attribute.
     * @see #isSetMaxReactivePower()
     * @see #unsetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @generated
     */
    void setMaxReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxReactivePower <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @generated
     */
    void unsetMaxReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMaxReactivePower <em>Max Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Reactive Power</em>' attribute is set.
     * @see #unsetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @generated
     */
    boolean isSetMaxReactivePower();

    /**
     * Returns the value of the '<em><b>Min Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Active Power</em>' attribute.
     * @see #isSetMinActivePower()
     * @see #unsetMinActivePower()
     * @see #setMinActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MinActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.minActivePower' kind='element'"
     * @generated
     */
    Float getMinActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinActivePower <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Active Power</em>' attribute.
     * @see #isSetMinActivePower()
     * @see #unsetMinActivePower()
     * @see #getMinActivePower()
     * @generated
     */
    void setMinActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinActivePower <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinActivePower()
     * @see #getMinActivePower()
     * @see #setMinActivePower(Float)
     * @generated
     */
    void unsetMinActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinActivePower <em>Min Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Active Power</em>' attribute is set.
     * @see #unsetMinActivePower()
     * @see #getMinActivePower()
     * @see #setMinActivePower(Float)
     * @generated
     */
    boolean isSetMinActivePower();

    /**
     * Returns the value of the '<em><b>Min Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Apparent Power</em>' attribute.
     * @see #isSetMinApparentPower()
     * @see #unsetMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MinApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.minApparentPower' kind='element'"
     * @generated
     */
    Float getMinApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinApparentPower <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Apparent Power</em>' attribute.
     * @see #isSetMinApparentPower()
     * @see #unsetMinApparentPower()
     * @see #getMinApparentPower()
     * @generated
     */
    void setMinApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinApparentPower <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinApparentPower()
     * @see #getMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @generated
     */
    void unsetMinApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinApparentPower <em>Min Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Apparent Power</em>' attribute is set.
     * @see #unsetMinApparentPower()
     * @see #getMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @generated
     */
    boolean isSetMinApparentPower();

    /**
     * Returns the value of the '<em><b>Min Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Reactive Power</em>' attribute.
     * @see #isSetMinReactivePower()
     * @see #unsetMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_MinReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.minReactivePower' kind='element'"
     * @generated
     */
    Float getMinReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinReactivePower <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Reactive Power</em>' attribute.
     * @see #isSetMinReactivePower()
     * @see #unsetMinReactivePower()
     * @see #getMinReactivePower()
     * @generated
     */
    void setMinReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinReactivePower <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinReactivePower()
     * @see #getMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @generated
     */
    void unsetMinReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getMinReactivePower <em>Min Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Reactive Power</em>' attribute is set.
     * @see #unsetMinReactivePower()
     * @see #getMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @generated
     */
    boolean isSetMinReactivePower();

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #setSequence(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_Sequence()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.sequence' kind='element'"
     * @generated
     */
    Integer getSequence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #getSequence()
     * @generated
     */
    void setSequence( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequence()
     * @see #getSequence()
     * @see #setSequence(Integer)
     * @generated
     */
    void unsetSequence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getSequence <em>Sequence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence</em>' attribute is set.
     * @see #unsetSequence()
     * @see #getSequence()
     * @see #setSequence(Integer)
     * @generated
     */
    boolean isSetSequence();

    /**
     * Returns the value of the '<em><b>Prediction Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prediction Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prediction Interval</em>' containment reference.
     * @see #isSetPredictionInterval()
     * @see #unsetPredictionInterval()
     * @see #setPredictionInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_PredictionInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.predictionInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getPredictionInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getPredictionInterval <em>Prediction Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prediction Interval</em>' containment reference.
     * @see #isSetPredictionInterval()
     * @see #unsetPredictionInterval()
     * @see #getPredictionInterval()
     * @generated
     */
    void setPredictionInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getPredictionInterval <em>Prediction Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredictionInterval()
     * @see #getPredictionInterval()
     * @see #setPredictionInterval(DateTimeInterval)
     * @generated
     */
    void unsetPredictionInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getPredictionInterval <em>Prediction Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prediction Interval</em>' containment reference is set.
     * @see #unsetPredictionInterval()
     * @see #getPredictionInterval()
     * @see #setPredictionInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetPredictionInterval();

    /**
     * Returns the value of the '<em><b>Other Capability</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getDERGroupForecast <em>DER Group Forecast</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Other Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Other Capability</em>' reference list.
     * @see #isSetOtherCapability()
     * @see #unsetOtherCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_OtherCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getDERGroupForecast
     * @model opposite="DERGroupForecast" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.OtherCapability' kind='element'"
     * @generated
     */
    EList< OtherCapability > getOtherCapability();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getOtherCapability <em>Other Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOtherCapability()
     * @see #getOtherCapability()
     * @generated
     */
    void unsetOtherCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getOtherCapability <em>Other Capability</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Other Capability</em>' reference list is set.
     * @see #unsetOtherCapability()
     * @see #getOtherCapability()
     * @generated
     */
    boolean isSetOtherCapability();

    /**
     * Returns the value of the '<em><b>DER Group Forecast</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictions <em>Predictions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DER Group Forecast</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DER Group Forecast</em>' reference list.
     * @see #isSetDERGroupForecast()
     * @see #unsetDERGroupForecast()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPredictions_DERGroupForecast()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast#getPredictions
     * @model opposite="Predictions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Predictions.DERGroupForecast' kind='element'"
     * @generated
     */
    EList< DERGroupForecast > getDERGroupForecast();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getDERGroupForecast <em>DER Group Forecast</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDERGroupForecast()
     * @see #getDERGroupForecast()
     * @generated
     */
    void unsetDERGroupForecast();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getDERGroupForecast <em>DER Group Forecast</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DER Group Forecast</em>' reference list is set.
     * @see #unsetDERGroupForecast()
     * @see #getDERGroupForecast()
     * @generated
     */
    boolean isSetDERGroupForecast();

} // Predictions
