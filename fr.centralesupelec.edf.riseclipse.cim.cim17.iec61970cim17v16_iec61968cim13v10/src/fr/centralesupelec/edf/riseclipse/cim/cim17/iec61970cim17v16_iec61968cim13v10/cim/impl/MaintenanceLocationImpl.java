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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceLocationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceLocationImpl#getLot <em>Lot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceLocationImpl#getNearestIntersection <em>Nearest Intersection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceLocationImpl#getSubdivision <em>Subdivision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceLocationImpl extends WorkLocationImpl implements MaintenanceLocation {
    /**
     * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlock()
     * @generated
     * @ordered
     */
    protected static final String BLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlock()
     * @generated
     * @ordered
     */
    protected String block = BLOCK_EDEFAULT;

    /**
     * This is true if the Block attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blockESet;

    /**
     * The default value of the '{@link #getLot() <em>Lot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLot()
     * @generated
     * @ordered
     */
    protected static final String LOT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLot() <em>Lot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLot()
     * @generated
     * @ordered
     */
    protected String lot = LOT_EDEFAULT;

    /**
     * This is true if the Lot attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lotESet;

    /**
     * The default value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNearestIntersection()
     * @generated
     * @ordered
     */
    protected static final String NEAREST_INTERSECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNearestIntersection()
     * @generated
     * @ordered
     */
    protected String nearestIntersection = NEAREST_INTERSECTION_EDEFAULT;

    /**
     * This is true if the Nearest Intersection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nearestIntersectionESet;

    /**
     * The default value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubdivision()
     * @generated
     * @ordered
     */
    protected static final String SUBDIVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubdivision()
     * @generated
     * @ordered
     */
    protected String subdivision = SUBDIVISION_EDEFAULT;

    /**
     * This is true if the Subdivision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subdivisionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaintenanceLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMaintenanceLocation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBlock() {
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlock( String newBlock ) {
        String oldBlock = block;
        block = newBlock;
        boolean oldBlockESet = blockESet;
        blockESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_LOCATION__BLOCK, oldBlock, block, !oldBlockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBlock() {
        String oldBlock = block;
        boolean oldBlockESet = blockESet;
        block = BLOCK_EDEFAULT;
        blockESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MAINTENANCE_LOCATION__BLOCK, oldBlock, BLOCK_EDEFAULT, oldBlockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBlock() {
        return blockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLot() {
        return lot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLot( String newLot ) {
        String oldLot = lot;
        lot = newLot;
        boolean oldLotESet = lotESet;
        lotESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_LOCATION__LOT, oldLot, lot, !oldLotESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLot() {
        String oldLot = lot;
        boolean oldLotESet = lotESet;
        lot = LOT_EDEFAULT;
        lotESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MAINTENANCE_LOCATION__LOT, oldLot, LOT_EDEFAULT, oldLotESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLot() {
        return lotESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNearestIntersection() {
        return nearestIntersection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNearestIntersection( String newNearestIntersection ) {
        String oldNearestIntersection = nearestIntersection;
        nearestIntersection = newNearestIntersection;
        boolean oldNearestIntersectionESet = nearestIntersectionESet;
        nearestIntersectionESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION,
                        oldNearestIntersection, nearestIntersection, !oldNearestIntersectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNearestIntersection() {
        String oldNearestIntersection = nearestIntersection;
        boolean oldNearestIntersectionESet = nearestIntersectionESet;
        nearestIntersection = NEAREST_INTERSECTION_EDEFAULT;
        nearestIntersectionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION,
                        oldNearestIntersection, NEAREST_INTERSECTION_EDEFAULT, oldNearestIntersectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNearestIntersection() {
        return nearestIntersectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubdivision( String newSubdivision ) {
        String oldSubdivision = subdivision;
        subdivision = newSubdivision;
        boolean oldSubdivisionESet = subdivisionESet;
        subdivisionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_LOCATION__SUBDIVISION, oldSubdivision, subdivision, !oldSubdivisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubdivision() {
        String oldSubdivision = subdivision;
        boolean oldSubdivisionESet = subdivisionESet;
        subdivision = SUBDIVISION_EDEFAULT;
        subdivisionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MAINTENANCE_LOCATION__SUBDIVISION,
                    oldSubdivision, SUBDIVISION_EDEFAULT, oldSubdivisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubdivision() {
        return subdivisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_LOCATION__BLOCK:
            return getBlock();
        case CimPackage.MAINTENANCE_LOCATION__LOT:
            return getLot();
        case CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION:
            return getNearestIntersection();
        case CimPackage.MAINTENANCE_LOCATION__SUBDIVISION:
            return getSubdivision();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_LOCATION__BLOCK:
            setBlock( ( String ) newValue );
            return;
        case CimPackage.MAINTENANCE_LOCATION__LOT:
            setLot( ( String ) newValue );
            return;
        case CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION:
            setNearestIntersection( ( String ) newValue );
            return;
        case CimPackage.MAINTENANCE_LOCATION__SUBDIVISION:
            setSubdivision( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_LOCATION__BLOCK:
            unsetBlock();
            return;
        case CimPackage.MAINTENANCE_LOCATION__LOT:
            unsetLot();
            return;
        case CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION:
            unsetNearestIntersection();
            return;
        case CimPackage.MAINTENANCE_LOCATION__SUBDIVISION:
            unsetSubdivision();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_LOCATION__BLOCK:
            return isSetBlock();
        case CimPackage.MAINTENANCE_LOCATION__LOT:
            return isSetLot();
        case CimPackage.MAINTENANCE_LOCATION__NEAREST_INTERSECTION:
            return isSetNearestIntersection();
        case CimPackage.MAINTENANCE_LOCATION__SUBDIVISION:
            return isSetSubdivision();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (block: " );
        if( blockESet )
            result.append( block );
        else
            result.append( "<unset>" );
        result.append( ", lot: " );
        if( lotESet )
            result.append( lot );
        else
            result.append( "<unset>" );
        result.append( ", nearestIntersection: " );
        if( nearestIntersectionESet )
            result.append( nearestIntersection );
        else
            result.append( "<unset>" );
        result.append( ", subdivision: " );
        if( subdivisionESet )
            result.append( subdivision );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MaintenanceLocationImpl
