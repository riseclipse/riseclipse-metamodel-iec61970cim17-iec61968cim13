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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DemandResponseProgram;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Point Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointGroupImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointGroupImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointGroupImpl#getDemandResponsePrograms <em>Demand Response Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePointGroupImpl extends IdentifiedObjectImpl implements UsagePointGroup {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControls()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceControl > endDeviceControls;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * The cached value of the '{@link #getDemandResponsePrograms() <em>Demand Response Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponsePrograms()
     * @generated
     * @ordered
     */
    protected EList< DemandResponseProgram > demandResponsePrograms;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UsagePointGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUsagePointGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT_GROUP__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT_GROUP__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceControl > getEndDeviceControls() {
        if( endDeviceControls == null ) {
            endDeviceControls = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceControl >(
                    EndDeviceControl.class, this, CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS,
                    CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS );
        }
        return endDeviceControls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceControls() {
        if( endDeviceControls != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControls() {
        return endDeviceControls != null && ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePoint >( UsagePoint.class,
                    this, CimPackage.USAGE_POINT_GROUP__USAGE_POINTS, CimPackage.USAGE_POINT__USAGE_POINT_GROUPS );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DemandResponseProgram > getDemandResponsePrograms() {
        if( demandResponsePrograms == null ) {
            demandResponsePrograms = new EObjectWithInverseEList.Unsettable.ManyInverse< DemandResponseProgram >(
                    DemandResponseProgram.class, this, CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS );
        }
        return demandResponsePrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDemandResponsePrograms() {
        if( demandResponsePrograms != null ) ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDemandResponsePrograms() {
        return demandResponsePrograms != null && ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceControls() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDemandResponsePrograms() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< ? > ) getEndDeviceControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< ? > ) getDemandResponsePrograms() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT_GROUP__TYPE:
            return getType();
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            return getEndDeviceControls();
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return getDemandResponsePrograms();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT_GROUP__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            getEndDeviceControls().clear();
            getEndDeviceControls().addAll( ( Collection< ? extends EndDeviceControl > ) newValue );
            return;
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            getDemandResponsePrograms().clear();
            getDemandResponsePrograms().addAll( ( Collection< ? extends DemandResponseProgram > ) newValue );
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
        case CimPackage.USAGE_POINT_GROUP__TYPE:
            unsetType();
            return;
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            unsetEndDeviceControls();
            return;
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            unsetDemandResponsePrograms();
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
        case CimPackage.USAGE_POINT_GROUP__TYPE:
            return isSetType();
        case CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS:
            return isSetEndDeviceControls();
        case CimPackage.USAGE_POINT_GROUP__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return isSetDemandResponsePrograms();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UsagePointGroupImpl
