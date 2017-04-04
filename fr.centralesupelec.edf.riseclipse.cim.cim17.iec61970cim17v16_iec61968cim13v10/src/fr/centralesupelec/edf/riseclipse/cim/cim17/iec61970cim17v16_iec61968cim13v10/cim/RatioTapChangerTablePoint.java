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
 * A representation of the model object '<em><b>Ratio Tap Changer Table Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChangerTablePoint()
 * @model
 * @generated
 */
public interface RatioTapChangerTablePoint extends TapChangerTablePoint {
    /**
     * Returns the value of the '<em><b>Ratio Tap Changer Table</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable#getRatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ratio Tap Changer Table</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChangerTablePoint_RatioTapChangerTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable#getRatioTapChangerTablePoint
     * @model opposite="RatioTapChangerTablePoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RatioTapChangerTablePoint.RatioTapChangerTable' kind='element'"
     * @generated
     */
    RatioTapChangerTable getRatioTapChangerTable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @generated
     */
    void setRatioTapChangerTable( RatioTapChangerTable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    void unsetRatioTapChangerTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer Table</em>' reference is set.
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    boolean isSetRatioTapChangerTable();

} // RatioTapChangerTablePoint
