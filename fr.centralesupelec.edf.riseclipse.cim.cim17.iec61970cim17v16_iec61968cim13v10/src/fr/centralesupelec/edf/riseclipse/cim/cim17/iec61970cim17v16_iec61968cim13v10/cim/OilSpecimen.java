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
 * A representation of the model object '<em><b>Oil Specimen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTakenFrom <em>Oil Sample Taken From</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTemperature <em>Oil Sample Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilTemperatureSource <em>Oil Temperature Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getSampleContainer <em>Sample Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilSpecimen()
 * @model
 * @generated
 */
public interface OilSpecimen extends Specimen {
    /**
     * Returns the value of the '<em><b>Oil Sample Taken From</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSampleLocation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Oil Sample Taken From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Oil Sample Taken From</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSampleLocation
     * @see #isSetOilSampleTakenFrom()
     * @see #unsetOilSampleTakenFrom()
     * @see #setOilSampleTakenFrom(OilSampleLocation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilSpecimen_OilSampleTakenFrom()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OilSpecimen.oilSampleTakenFrom' kind='element'"
     * @generated
     */
    OilSampleLocation getOilSampleTakenFrom();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTakenFrom <em>Oil Sample Taken From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oil Sample Taken From</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSampleLocation
     * @see #isSetOilSampleTakenFrom()
     * @see #unsetOilSampleTakenFrom()
     * @see #getOilSampleTakenFrom()
     * @generated
     */
    void setOilSampleTakenFrom( OilSampleLocation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTakenFrom <em>Oil Sample Taken From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOilSampleTakenFrom()
     * @see #getOilSampleTakenFrom()
     * @see #setOilSampleTakenFrom(OilSampleLocation)
     * @generated
     */
    void unsetOilSampleTakenFrom();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTakenFrom <em>Oil Sample Taken From</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oil Sample Taken From</em>' attribute is set.
     * @see #unsetOilSampleTakenFrom()
     * @see #getOilSampleTakenFrom()
     * @see #setOilSampleTakenFrom(OilSampleLocation)
     * @generated
     */
    boolean isSetOilSampleTakenFrom();

    /**
     * Returns the value of the '<em><b>Oil Sample Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Oil Sample Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Oil Sample Temperature</em>' attribute.
     * @see #isSetOilSampleTemperature()
     * @see #unsetOilSampleTemperature()
     * @see #setOilSampleTemperature(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilSpecimen_OilSampleTemperature()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OilSpecimen.oilSampleTemperature' kind='element'"
     * @generated
     */
    Float getOilSampleTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTemperature <em>Oil Sample Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oil Sample Temperature</em>' attribute.
     * @see #isSetOilSampleTemperature()
     * @see #unsetOilSampleTemperature()
     * @see #getOilSampleTemperature()
     * @generated
     */
    void setOilSampleTemperature( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTemperature <em>Oil Sample Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOilSampleTemperature()
     * @see #getOilSampleTemperature()
     * @see #setOilSampleTemperature(Float)
     * @generated
     */
    void unsetOilSampleTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilSampleTemperature <em>Oil Sample Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oil Sample Temperature</em>' attribute is set.
     * @see #unsetOilSampleTemperature()
     * @see #getOilSampleTemperature()
     * @see #setOilSampleTemperature(Float)
     * @generated
     */
    boolean isSetOilSampleTemperature();

    /**
     * Returns the value of the '<em><b>Oil Temperature Source</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilTemperatureSource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Oil Temperature Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Oil Temperature Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilTemperatureSource
     * @see #isSetOilTemperatureSource()
     * @see #unsetOilTemperatureSource()
     * @see #setOilTemperatureSource(OilTemperatureSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilSpecimen_OilTemperatureSource()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OilSpecimen.oilTemperatureSource' kind='element'"
     * @generated
     */
    OilTemperatureSource getOilTemperatureSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilTemperatureSource <em>Oil Temperature Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oil Temperature Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilTemperatureSource
     * @see #isSetOilTemperatureSource()
     * @see #unsetOilTemperatureSource()
     * @see #getOilTemperatureSource()
     * @generated
     */
    void setOilTemperatureSource( OilTemperatureSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilTemperatureSource <em>Oil Temperature Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOilTemperatureSource()
     * @see #getOilTemperatureSource()
     * @see #setOilTemperatureSource(OilTemperatureSource)
     * @generated
     */
    void unsetOilTemperatureSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getOilTemperatureSource <em>Oil Temperature Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oil Temperature Source</em>' attribute is set.
     * @see #unsetOilTemperatureSource()
     * @see #getOilTemperatureSource()
     * @see #setOilTemperatureSource(OilTemperatureSource)
     * @generated
     */
    boolean isSetOilTemperatureSource();

    /**
     * Returns the value of the '<em><b>Sample Container</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SampleContainerType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sample Container</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sample Container</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SampleContainerType
     * @see #isSetSampleContainer()
     * @see #unsetSampleContainer()
     * @see #setSampleContainer(SampleContainerType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilSpecimen_SampleContainer()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OilSpecimen.sampleContainer' kind='element'"
     * @generated
     */
    SampleContainerType getSampleContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getSampleContainer <em>Sample Container</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sample Container</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SampleContainerType
     * @see #isSetSampleContainer()
     * @see #unsetSampleContainer()
     * @see #getSampleContainer()
     * @generated
     */
    void setSampleContainer( SampleContainerType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getSampleContainer <em>Sample Container</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSampleContainer()
     * @see #getSampleContainer()
     * @see #setSampleContainer(SampleContainerType)
     * @generated
     */
    void unsetSampleContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen#getSampleContainer <em>Sample Container</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sample Container</em>' attribute is set.
     * @see #unsetSampleContainer()
     * @see #getSampleContainer()
     * @see #setSampleContainer(SampleContainerType)
     * @generated
     */
    boolean isSetSampleContainer();

} // OilSpecimen
