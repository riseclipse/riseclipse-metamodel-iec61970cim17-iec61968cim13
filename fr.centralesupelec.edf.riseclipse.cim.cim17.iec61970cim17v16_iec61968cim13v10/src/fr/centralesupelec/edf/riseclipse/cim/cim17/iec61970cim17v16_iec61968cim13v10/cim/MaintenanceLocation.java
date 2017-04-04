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
 * A representation of the model object '<em><b>Maintenance Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getLot <em>Lot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getNearestIntersection <em>Nearest Intersection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getSubdivision <em>Subdivision</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceLocation()
 * @model
 * @generated
 */
public interface MaintenanceLocation extends WorkLocation {
    /**
     * Returns the value of the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Block</em>' attribute.
     * @see #isSetBlock()
     * @see #unsetBlock()
     * @see #setBlock(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceLocation_Block()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceLocation.block' kind='element'"
     * @generated
     */
    String getBlock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getBlock <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Block</em>' attribute.
     * @see #isSetBlock()
     * @see #unsetBlock()
     * @see #getBlock()
     * @generated
     */
    void setBlock( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getBlock <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBlock()
     * @see #getBlock()
     * @see #setBlock(String)
     * @generated
     */
    void unsetBlock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getBlock <em>Block</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Block</em>' attribute is set.
     * @see #unsetBlock()
     * @see #getBlock()
     * @see #setBlock(String)
     * @generated
     */
    boolean isSetBlock();

    /**
     * Returns the value of the '<em><b>Lot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lot</em>' attribute.
     * @see #isSetLot()
     * @see #unsetLot()
     * @see #setLot(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceLocation_Lot()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceLocation.lot' kind='element'"
     * @generated
     */
    String getLot();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getLot <em>Lot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lot</em>' attribute.
     * @see #isSetLot()
     * @see #unsetLot()
     * @see #getLot()
     * @generated
     */
    void setLot( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getLot <em>Lot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLot()
     * @see #getLot()
     * @see #setLot(String)
     * @generated
     */
    void unsetLot();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getLot <em>Lot</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lot</em>' attribute is set.
     * @see #unsetLot()
     * @see #getLot()
     * @see #setLot(String)
     * @generated
     */
    boolean isSetLot();

    /**
     * Returns the value of the '<em><b>Nearest Intersection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nearest Intersection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nearest Intersection</em>' attribute.
     * @see #isSetNearestIntersection()
     * @see #unsetNearestIntersection()
     * @see #setNearestIntersection(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceLocation_NearestIntersection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceLocation.nearestIntersection' kind='element'"
     * @generated
     */
    String getNearestIntersection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nearest Intersection</em>' attribute.
     * @see #isSetNearestIntersection()
     * @see #unsetNearestIntersection()
     * @see #getNearestIntersection()
     * @generated
     */
    void setNearestIntersection( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNearestIntersection()
     * @see #getNearestIntersection()
     * @see #setNearestIntersection(String)
     * @generated
     */
    void unsetNearestIntersection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nearest Intersection</em>' attribute is set.
     * @see #unsetNearestIntersection()
     * @see #getNearestIntersection()
     * @see #setNearestIntersection(String)
     * @generated
     */
    boolean isSetNearestIntersection();

    /**
     * Returns the value of the '<em><b>Subdivision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subdivision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subdivision</em>' attribute.
     * @see #isSetSubdivision()
     * @see #unsetSubdivision()
     * @see #setSubdivision(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceLocation_Subdivision()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceLocation.subdivision' kind='element'"
     * @generated
     */
    String getSubdivision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getSubdivision <em>Subdivision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subdivision</em>' attribute.
     * @see #isSetSubdivision()
     * @see #unsetSubdivision()
     * @see #getSubdivision()
     * @generated
     */
    void setSubdivision( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getSubdivision <em>Subdivision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubdivision()
     * @see #getSubdivision()
     * @see #setSubdivision(String)
     * @generated
     */
    void unsetSubdivision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation#getSubdivision <em>Subdivision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subdivision</em>' attribute is set.
     * @see #unsetSubdivision()
     * @see #getSubdivision()
     * @see #setSubdivision(String)
     * @generated
     */
    boolean isSetSubdivision();

} // MaintenanceLocation
