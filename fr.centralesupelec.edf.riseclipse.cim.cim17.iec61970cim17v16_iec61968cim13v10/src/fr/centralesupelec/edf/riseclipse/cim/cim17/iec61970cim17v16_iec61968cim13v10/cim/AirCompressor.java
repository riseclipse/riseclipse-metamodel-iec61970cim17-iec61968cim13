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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Air Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCAESPlant <em>CAES Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAirCompressor()
 * @model
 * @generated
 */
public interface AirCompressor extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Air Compressor Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Air Compressor Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Air Compressor Rating</em>' attribute.
     * @see #isSetAirCompressorRating()
     * @see #unsetAirCompressorRating()
     * @see #setAirCompressorRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAirCompressor_AirCompressorRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AirCompressor.airCompressorRating' kind='element'"
     * @generated
     */
    Float getAirCompressorRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Air Compressor Rating</em>' attribute.
     * @see #isSetAirCompressorRating()
     * @see #unsetAirCompressorRating()
     * @see #getAirCompressorRating()
     * @generated
     */
    void setAirCompressorRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAirCompressorRating()
     * @see #getAirCompressorRating()
     * @see #setAirCompressorRating(Float)
     * @generated
     */
    void unsetAirCompressorRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Air Compressor Rating</em>' attribute is set.
     * @see #unsetAirCompressorRating()
     * @see #getAirCompressorRating()
     * @see #setAirCompressorRating(Float)
     * @generated
     */
    boolean isSetAirCompressorRating();

    /**
     * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combustion Turbine</em>' reference.
     * @see #isSetCombustionTurbine()
     * @see #unsetCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAirCompressor_CombustionTurbine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor
     * @model opposite="AirCompressor" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AirCompressor.CombustionTurbine' kind='element'"
     * @generated
     */
    CombustionTurbine getCombustionTurbine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combustion Turbine</em>' reference.
     * @see #isSetCombustionTurbine()
     * @see #unsetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @generated
     */
    void setCombustionTurbine( CombustionTurbine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @generated
     */
    void unsetCombustionTurbine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Combustion Turbine</em>' reference is set.
     * @see #unsetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @generated
     */
    boolean isSetCombustionTurbine();

    /**
     * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant#getAirCompressor <em>Air Compressor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAirCompressor_CAESPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant#getAirCompressor
     * @model opposite="AirCompressor" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AirCompressor.CAESPlant' kind='element'"
     * @generated
     */
    CAESPlant getCAESPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @generated
     */
    void setCAESPlant( CAESPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    void unsetCAESPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCAESPlant <em>CAES Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CAES Plant</em>' reference is set.
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    boolean isSetCAESPlant();

} // AirCompressor
