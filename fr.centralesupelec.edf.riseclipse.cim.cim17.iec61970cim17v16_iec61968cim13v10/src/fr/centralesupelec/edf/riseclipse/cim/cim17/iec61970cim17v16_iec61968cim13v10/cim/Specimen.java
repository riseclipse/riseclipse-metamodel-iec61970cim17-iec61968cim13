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
 * A representation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAmbientTemperatureAtSampling <em>Ambient Temperature At Sampling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getHumidityAtSampling <em>Humidity At Sampling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenSampleDateTime <em>Specimen Sample Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getLabTestDataSet <em>Lab Test Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAssetTestSampleTaker <em>Asset Test Sample Taker</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen()
 * @model
 * @generated
 */
public interface Specimen extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Ambient Temperature At Sampling</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ambient Temperature At Sampling</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ambient Temperature At Sampling</em>' attribute.
     * @see #isSetAmbientTemperatureAtSampling()
     * @see #unsetAmbientTemperatureAtSampling()
     * @see #setAmbientTemperatureAtSampling(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_AmbientTemperatureAtSampling()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.ambientTemperatureAtSampling' kind='element'"
     * @generated
     */
    Float getAmbientTemperatureAtSampling();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAmbientTemperatureAtSampling <em>Ambient Temperature At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ambient Temperature At Sampling</em>' attribute.
     * @see #isSetAmbientTemperatureAtSampling()
     * @see #unsetAmbientTemperatureAtSampling()
     * @see #getAmbientTemperatureAtSampling()
     * @generated
     */
    void setAmbientTemperatureAtSampling( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAmbientTemperatureAtSampling <em>Ambient Temperature At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmbientTemperatureAtSampling()
     * @see #getAmbientTemperatureAtSampling()
     * @see #setAmbientTemperatureAtSampling(Float)
     * @generated
     */
    void unsetAmbientTemperatureAtSampling();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAmbientTemperatureAtSampling <em>Ambient Temperature At Sampling</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ambient Temperature At Sampling</em>' attribute is set.
     * @see #unsetAmbientTemperatureAtSampling()
     * @see #getAmbientTemperatureAtSampling()
     * @see #setAmbientTemperatureAtSampling(Float)
     * @generated
     */
    boolean isSetAmbientTemperatureAtSampling();

    /**
     * Returns the value of the '<em><b>Humidity At Sampling</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Humidity At Sampling</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Humidity At Sampling</em>' attribute.
     * @see #isSetHumidityAtSampling()
     * @see #unsetHumidityAtSampling()
     * @see #setHumidityAtSampling(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_HumidityAtSampling()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.humidityAtSampling' kind='element'"
     * @generated
     */
    Float getHumidityAtSampling();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getHumidityAtSampling <em>Humidity At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Humidity At Sampling</em>' attribute.
     * @see #isSetHumidityAtSampling()
     * @see #unsetHumidityAtSampling()
     * @see #getHumidityAtSampling()
     * @generated
     */
    void setHumidityAtSampling( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getHumidityAtSampling <em>Humidity At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHumidityAtSampling()
     * @see #getHumidityAtSampling()
     * @see #setHumidityAtSampling(Float)
     * @generated
     */
    void unsetHumidityAtSampling();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getHumidityAtSampling <em>Humidity At Sampling</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Humidity At Sampling</em>' attribute is set.
     * @see #unsetHumidityAtSampling()
     * @see #getHumidityAtSampling()
     * @see #setHumidityAtSampling(Float)
     * @generated
     */
    boolean isSetHumidityAtSampling();

    /**
     * Returns the value of the '<em><b>Specimen ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen ID</em>' attribute.
     * @see #isSetSpecimenID()
     * @see #unsetSpecimenID()
     * @see #setSpecimenID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_SpecimenID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.specimenID' kind='element'"
     * @generated
     */
    String getSpecimenID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenID <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen ID</em>' attribute.
     * @see #isSetSpecimenID()
     * @see #unsetSpecimenID()
     * @see #getSpecimenID()
     * @generated
     */
    void setSpecimenID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenID <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimenID()
     * @see #getSpecimenID()
     * @see #setSpecimenID(String)
     * @generated
     */
    void unsetSpecimenID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenID <em>Specimen ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen ID</em>' attribute is set.
     * @see #unsetSpecimenID()
     * @see #getSpecimenID()
     * @see #setSpecimenID(String)
     * @generated
     */
    boolean isSetSpecimenID();

    /**
     * Returns the value of the '<em><b>Specimen Sample Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen Sample Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen Sample Date Time</em>' attribute.
     * @see #isSetSpecimenSampleDateTime()
     * @see #unsetSpecimenSampleDateTime()
     * @see #setSpecimenSampleDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_SpecimenSampleDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.specimenSampleDateTime' kind='element'"
     * @generated
     */
    Date getSpecimenSampleDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenSampleDateTime <em>Specimen Sample Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen Sample Date Time</em>' attribute.
     * @see #isSetSpecimenSampleDateTime()
     * @see #unsetSpecimenSampleDateTime()
     * @see #getSpecimenSampleDateTime()
     * @generated
     */
    void setSpecimenSampleDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenSampleDateTime <em>Specimen Sample Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimenSampleDateTime()
     * @see #getSpecimenSampleDateTime()
     * @see #setSpecimenSampleDateTime(Date)
     * @generated
     */
    void unsetSpecimenSampleDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenSampleDateTime <em>Specimen Sample Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen Sample Date Time</em>' attribute is set.
     * @see #unsetSpecimenSampleDateTime()
     * @see #getSpecimenSampleDateTime()
     * @see #setSpecimenSampleDateTime(Date)
     * @generated
     */
    boolean isSetSpecimenSampleDateTime();

    /**
     * Returns the value of the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen To Lab Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen To Lab Date Time</em>' attribute.
     * @see #isSetSpecimenToLabDateTime()
     * @see #unsetSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_SpecimenToLabDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.specimenToLabDateTime' kind='element'"
     * @generated
     */
    Date getSpecimenToLabDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen To Lab Date Time</em>' attribute.
     * @see #isSetSpecimenToLabDateTime()
     * @see #unsetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @generated
     */
    void setSpecimenToLabDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @generated
     */
    void unsetSpecimenToLabDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen To Lab Date Time</em>' attribute is set.
     * @see #unsetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @generated
     */
    boolean isSetSpecimenToLabDateTime();

    /**
     * Returns the value of the '<em><b>Lab Test Data Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen <em>Specimen</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lab Test Data Set</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lab Test Data Set</em>' reference list.
     * @see #isSetLabTestDataSet()
     * @see #unsetLabTestDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_LabTestDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen
     * @model opposite="Specimen" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.LabTestDataSet' kind='element'"
     * @generated
     */
    EList< LabTestDataSet > getLabTestDataSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getLabTestDataSet <em>Lab Test Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLabTestDataSet()
     * @see #getLabTestDataSet()
     * @generated
     */
    void unsetLabTestDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getLabTestDataSet <em>Lab Test Data Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lab Test Data Set</em>' reference list is set.
     * @see #unsetLabTestDataSet()
     * @see #getLabTestDataSet()
     * @generated
     */
    boolean isSetLabTestDataSet();

    /**
     * Returns the value of the '<em><b>Asset Test Sample Taker</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestSampleTaker#getSpecimen <em>Specimen</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Test Sample Taker</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Test Sample Taker</em>' reference.
     * @see #isSetAssetTestSampleTaker()
     * @see #unsetAssetTestSampleTaker()
     * @see #setAssetTestSampleTaker(AssetTestSampleTaker)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSpecimen_AssetTestSampleTaker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestSampleTaker#getSpecimen
     * @model opposite="Specimen" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Specimen.AssetTestSampleTaker' kind='element'"
     * @generated
     */
    AssetTestSampleTaker getAssetTestSampleTaker();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAssetTestSampleTaker <em>Asset Test Sample Taker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Test Sample Taker</em>' reference.
     * @see #isSetAssetTestSampleTaker()
     * @see #unsetAssetTestSampleTaker()
     * @see #getAssetTestSampleTaker()
     * @generated
     */
    void setAssetTestSampleTaker( AssetTestSampleTaker value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAssetTestSampleTaker <em>Asset Test Sample Taker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetTestSampleTaker()
     * @see #getAssetTestSampleTaker()
     * @see #setAssetTestSampleTaker(AssetTestSampleTaker)
     * @generated
     */
    void unsetAssetTestSampleTaker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getAssetTestSampleTaker <em>Asset Test Sample Taker</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Test Sample Taker</em>' reference is set.
     * @see #unsetAssetTestSampleTaker()
     * @see #getAssetTestSampleTaker()
     * @see #setAssetTestSampleTaker(AssetTestSampleTaker)
     * @generated
     */
    boolean isSetAssetTestSampleTaker();

} // Specimen
