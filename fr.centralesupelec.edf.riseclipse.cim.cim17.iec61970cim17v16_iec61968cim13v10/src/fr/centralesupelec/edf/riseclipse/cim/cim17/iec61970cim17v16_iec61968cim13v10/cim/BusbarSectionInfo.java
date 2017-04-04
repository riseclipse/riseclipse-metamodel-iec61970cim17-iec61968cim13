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
 * A representation of the model object '<em><b>Busbar Section Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSectionInfo()
 * @model
 * @generated
 */
public interface BusbarSectionInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSectionInfo_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BusbarSectionInfo.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSectionInfo_RatedVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BusbarSectionInfo.ratedVoltage' kind='element'"
     * @generated
     */
    Float getRatedVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @generated
     */
    void setRatedVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    void unsetRatedVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSectionInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    boolean isSetRatedVoltage();

} // BusbarSectionInfo
