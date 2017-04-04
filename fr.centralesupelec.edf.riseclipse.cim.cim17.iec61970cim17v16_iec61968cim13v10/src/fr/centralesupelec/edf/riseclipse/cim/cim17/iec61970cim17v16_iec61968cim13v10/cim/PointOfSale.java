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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Of Sale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPointOfSale()
 * @model
 * @generated
 */
public interface PointOfSale extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPointOfSale_Location()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PointOfSale.location' kind='element'"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(String)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getLocation <em>Location</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' attribute is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(String)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>Cashier Shifts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale <em>Point Of Sale</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cashier Shifts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cashier Shifts</em>' reference list.
     * @see #isSetCashierShifts()
     * @see #unsetCashierShifts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPointOfSale_CashierShifts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale
     * @model opposite="PointOfSale" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PointOfSale.CashierShifts' kind='element'"
     * @generated
     */
    EList< CashierShift > getCashierShifts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCashierShifts()
     * @see #getCashierShifts()
     * @generated
     */
    void unsetCashierShifts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cashier Shifts</em>' reference list is set.
     * @see #unsetCashierShifts()
     * @see #getCashierShifts()
     * @generated
     */
    boolean isSetCashierShifts();

} // PointOfSale
