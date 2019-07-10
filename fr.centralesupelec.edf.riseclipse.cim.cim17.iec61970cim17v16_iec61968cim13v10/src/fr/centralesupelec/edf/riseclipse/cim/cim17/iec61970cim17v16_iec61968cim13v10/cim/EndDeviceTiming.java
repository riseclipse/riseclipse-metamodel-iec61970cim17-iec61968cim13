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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDurationIndefinite <em>Duration Indefinite</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getRandomisation <em>Randomisation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceTiming()
 * @model
 * @generated
 */
public interface EndDeviceTiming extends EObject {
    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #isSetDuration()
     * @see #unsetDuration()
     * @see #setDuration(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceTiming_Duration()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceTiming.duration' kind='element'"
     * @generated
     */
    Float getDuration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #isSetDuration()
     * @see #unsetDuration()
     * @see #getDuration()
     * @generated
     */
    void setDuration( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDuration()
     * @see #getDuration()
     * @see #setDuration(Float)
     * @generated
     */
    void unsetDuration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDuration <em>Duration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duration</em>' attribute is set.
     * @see #unsetDuration()
     * @see #getDuration()
     * @see #setDuration(Float)
     * @generated
     */
    boolean isSetDuration();

    /**
     * Returns the value of the '<em><b>Duration Indefinite</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration Indefinite</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration Indefinite</em>' attribute.
     * @see #isSetDurationIndefinite()
     * @see #unsetDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceTiming_DurationIndefinite()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceTiming.durationIndefinite' kind='element'"
     * @generated
     */
    Boolean getDurationIndefinite();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDurationIndefinite <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration Indefinite</em>' attribute.
     * @see #isSetDurationIndefinite()
     * @see #unsetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @generated
     */
    void setDurationIndefinite( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDurationIndefinite <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @generated
     */
    void unsetDurationIndefinite();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getDurationIndefinite <em>Duration Indefinite</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duration Indefinite</em>' attribute is set.
     * @see #unsetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @generated
     */
    boolean isSetDurationIndefinite();

    /**
     * Returns the value of the '<em><b>Randomisation</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RandomisationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Randomisation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Randomisation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RandomisationKind
     * @see #isSetRandomisation()
     * @see #unsetRandomisation()
     * @see #setRandomisation(RandomisationKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceTiming_Randomisation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceTiming.randomisation' kind='element'"
     * @generated
     */
    RandomisationKind getRandomisation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getRandomisation <em>Randomisation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Randomisation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RandomisationKind
     * @see #isSetRandomisation()
     * @see #unsetRandomisation()
     * @see #getRandomisation()
     * @generated
     */
    void setRandomisation( RandomisationKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getRandomisation <em>Randomisation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRandomisation()
     * @see #getRandomisation()
     * @see #setRandomisation(RandomisationKind)
     * @generated
     */
    void unsetRandomisation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getRandomisation <em>Randomisation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Randomisation</em>' attribute is set.
     * @see #unsetRandomisation()
     * @see #getRandomisation()
     * @see #setRandomisation(RandomisationKind)
     * @generated
     */
    boolean isSetRandomisation();

    /**
     * Returns the value of the '<em><b>Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval</em>' containment reference.
     * @see #isSetInterval()
     * @see #unsetInterval()
     * @see #setInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceTiming_Interval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceTiming.interval' kind='element'"
     * @generated
     */
    DateTimeInterval getInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getInterval <em>Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interval</em>' containment reference.
     * @see #isSetInterval()
     * @see #unsetInterval()
     * @see #getInterval()
     * @generated
     */
    void setInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getInterval <em>Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInterval()
     * @see #getInterval()
     * @see #setInterval(DateTimeInterval)
     * @generated
     */
    void unsetInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming#getInterval <em>Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval</em>' containment reference is set.
     * @see #unsetInterval()
     * @see #getInterval()
     * @see #setInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetInterval();

} // EndDeviceTiming
