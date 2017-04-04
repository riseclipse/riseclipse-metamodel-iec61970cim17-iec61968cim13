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
 * A representation of the model object '<em><b>Tape Shield Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapeShieldCableInfo()
 * @model
 * @generated
 */
public interface TapeShieldCableInfo extends CableInfo {
    /**
     * Returns the value of the '<em><b>Tape Lap</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tape Lap</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tape Lap</em>' attribute.
     * @see #isSetTapeLap()
     * @see #unsetTapeLap()
     * @see #setTapeLap(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapeShieldCableInfo_TapeLap()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapeShieldCableInfo.tapeLap' kind='element'"
     * @generated
     */
    Float getTapeLap();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tape Lap</em>' attribute.
     * @see #isSetTapeLap()
     * @see #unsetTapeLap()
     * @see #getTapeLap()
     * @generated
     */
    void setTapeLap( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapeLap()
     * @see #getTapeLap()
     * @see #setTapeLap(Float)
     * @generated
     */
    void unsetTapeLap();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tape Lap</em>' attribute is set.
     * @see #unsetTapeLap()
     * @see #getTapeLap()
     * @see #setTapeLap(Float)
     * @generated
     */
    boolean isSetTapeLap();

    /**
     * Returns the value of the '<em><b>Tape Thickness</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tape Thickness</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tape Thickness</em>' attribute.
     * @see #isSetTapeThickness()
     * @see #unsetTapeThickness()
     * @see #setTapeThickness(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapeShieldCableInfo_TapeThickness()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapeShieldCableInfo.tapeThickness' kind='element'"
     * @generated
     */
    Float getTapeThickness();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tape Thickness</em>' attribute.
     * @see #isSetTapeThickness()
     * @see #unsetTapeThickness()
     * @see #getTapeThickness()
     * @generated
     */
    void setTapeThickness( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapeThickness()
     * @see #getTapeThickness()
     * @see #setTapeThickness(Float)
     * @generated
     */
    void unsetTapeThickness();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tape Thickness</em>' attribute is set.
     * @see #unsetTapeThickness()
     * @see #getTapeThickness()
     * @see #setTapeThickness(Float)
     * @generated
     */
    boolean isSetTapeThickness();

} // TapeShieldCableInfo
