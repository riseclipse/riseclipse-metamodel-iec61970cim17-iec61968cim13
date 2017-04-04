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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaTypeKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getNetInterchange <em>Net Interchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getPTolerance <em>PTolerance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlAreaImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlAreaImpl extends PowerSystemResourceImpl implements ControlArea {
    /**
     * The default value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetInterchange()
     * @generated
     * @ordered
     */
    protected static final Float NET_INTERCHANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetInterchange()
     * @generated
     * @ordered
     */
    protected Float netInterchange = NET_INTERCHANGE_EDEFAULT;

    /**
     * This is true if the Net Interchange attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean netInterchangeESet;

    /**
     * The default value of the '{@link #getPTolerance() <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPTolerance()
     * @generated
     * @ordered
     */
    protected static final Float PTOLERANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPTolerance() <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPTolerance()
     * @generated
     * @ordered
     */
    protected Float pTolerance = PTOLERANCE_EDEFAULT;

    /**
     * This is true if the PTolerance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pToleranceESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ControlAreaTypeKind TYPE_EDEFAULT = ControlAreaTypeKind.AGC;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ControlAreaTypeKind type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getEnergyArea() <em>Energy Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyArea()
     * @generated
     * @ordered
     */
    protected EnergyArea energyArea;

    /**
     * This is true if the Energy Area reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyAreaESet;

    /**
     * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTieFlow()
     * @generated
     * @ordered
     */
    protected EList< TieFlow > tieFlow;

    /**
     * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlAreaGeneratingUnit()
     * @generated
     * @ordered
     */
    protected EList< ControlAreaGeneratingUnit > controlAreaGeneratingUnit;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlAreaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getControlArea();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNetInterchange() {
        return netInterchange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNetInterchange( Float newNetInterchange ) {
        Float oldNetInterchange = netInterchange;
        netInterchange = newNetInterchange;
        boolean oldNetInterchangeESet = netInterchangeESet;
        netInterchangeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL_AREA__NET_INTERCHANGE, oldNetInterchange, netInterchange, !oldNetInterchangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNetInterchange() {
        Float oldNetInterchange = netInterchange;
        boolean oldNetInterchangeESet = netInterchangeESet;
        netInterchange = NET_INTERCHANGE_EDEFAULT;
        netInterchangeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROL_AREA__NET_INTERCHANGE,
                    oldNetInterchange, NET_INTERCHANGE_EDEFAULT, oldNetInterchangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNetInterchange() {
        return netInterchangeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPTolerance() {
        return pTolerance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPTolerance( Float newPTolerance ) {
        Float oldPTolerance = pTolerance;
        pTolerance = newPTolerance;
        boolean oldPToleranceESet = pToleranceESet;
        pToleranceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL_AREA__PTOLERANCE, oldPTolerance, pTolerance, !oldPToleranceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPTolerance() {
        Float oldPTolerance = pTolerance;
        boolean oldPToleranceESet = pToleranceESet;
        pTolerance = PTOLERANCE_EDEFAULT;
        pToleranceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROL_AREA__PTOLERANCE, oldPTolerance, PTOLERANCE_EDEFAULT, oldPToleranceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPTolerance() {
        return pToleranceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlAreaTypeKind getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( ControlAreaTypeKind newType ) {
        ControlAreaTypeKind oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL_AREA__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        ControlAreaTypeKind oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROL_AREA__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
    public EnergyArea getEnergyArea() {
        return energyArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergyArea( EnergyArea newEnergyArea, NotificationChain msgs ) {
        EnergyArea oldEnergyArea = energyArea;
        energyArea = newEnergyArea;
        boolean oldEnergyAreaESet = energyAreaESet;
        energyAreaESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, oldEnergyArea, newEnergyArea, !oldEnergyAreaESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyArea( EnergyArea newEnergyArea ) {
        if( newEnergyArea != energyArea ) {
            NotificationChain msgs = null;
            if( energyArea != null ) msgs = ( ( InternalEObject ) energyArea ).eInverseRemove( this,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs );
            if( newEnergyArea != null ) msgs = ( ( InternalEObject ) newEnergyArea ).eInverseAdd( this,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs );
            msgs = basicSetEnergyArea( newEnergyArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergyAreaESet = energyAreaESet;
            energyAreaESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, newEnergyArea, newEnergyArea, !oldEnergyAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergyArea( NotificationChain msgs ) {
        EnergyArea oldEnergyArea = energyArea;
        energyArea = null;
        boolean oldEnergyAreaESet = energyAreaESet;
        energyAreaESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, oldEnergyArea, null, oldEnergyAreaESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyArea() {
        if( energyArea != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energyArea ).eInverseRemove( this, CimPackage.ENERGY_AREA__CONTROL_AREA,
                    EnergyArea.class, msgs );
            msgs = basicUnsetEnergyArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergyAreaESet = energyAreaESet;
            energyAreaESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, null, null, oldEnergyAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyArea() {
        return energyAreaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TieFlow > getTieFlow() {
        if( tieFlow == null ) {
            tieFlow = new EObjectWithInverseResolvingEList.Unsettable< TieFlow >( TieFlow.class, this,
                    CimPackage.CONTROL_AREA__TIE_FLOW, CimPackage.TIE_FLOW__CONTROL_AREA );
        }
        return tieFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTieFlow() {
        if( tieFlow != null ) ( ( InternalEList.Unsettable< ? > ) tieFlow ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTieFlow() {
        return tieFlow != null && ( ( InternalEList.Unsettable< ? > ) tieFlow ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit == null ) {
            controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList.Unsettable< ControlAreaGeneratingUnit >(
                    ControlAreaGeneratingUnit.class, this, CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA );
        }
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit != null ) ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlAreaGeneratingUnit() {
        return controlAreaGeneratingUnit != null
                && ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).isSet();
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
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            if( energyArea != null ) msgs = ( ( InternalEObject ) energyArea ).eInverseRemove( this,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs );
            return basicSetEnergyArea( ( EnergyArea ) otherEnd, msgs );
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTieFlow() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControlAreaGeneratingUnit() )
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
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            return basicUnsetEnergyArea( msgs );
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            return ( ( InternalEList< ? > ) getTieFlow() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< ? > ) getControlAreaGeneratingUnit() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CONTROL_AREA__NET_INTERCHANGE:
            return getNetInterchange();
        case CimPackage.CONTROL_AREA__PTOLERANCE:
            return getPTolerance();
        case CimPackage.CONTROL_AREA__TYPE:
            return getType();
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            return getEnergyArea();
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            return getTieFlow();
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            return getControlAreaGeneratingUnit();
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
        case CimPackage.CONTROL_AREA__NET_INTERCHANGE:
            setNetInterchange( ( Float ) newValue );
            return;
        case CimPackage.CONTROL_AREA__PTOLERANCE:
            setPTolerance( ( Float ) newValue );
            return;
        case CimPackage.CONTROL_AREA__TYPE:
            setType( ( ControlAreaTypeKind ) newValue );
            return;
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            setEnergyArea( ( EnergyArea ) newValue );
            return;
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            getTieFlow().clear();
            getTieFlow().addAll( ( Collection< ? extends TieFlow > ) newValue );
            return;
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            getControlAreaGeneratingUnit().clear();
            getControlAreaGeneratingUnit().addAll( ( Collection< ? extends ControlAreaGeneratingUnit > ) newValue );
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
        case CimPackage.CONTROL_AREA__NET_INTERCHANGE:
            unsetNetInterchange();
            return;
        case CimPackage.CONTROL_AREA__PTOLERANCE:
            unsetPTolerance();
            return;
        case CimPackage.CONTROL_AREA__TYPE:
            unsetType();
            return;
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            unsetEnergyArea();
            return;
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            unsetTieFlow();
            return;
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            unsetControlAreaGeneratingUnit();
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
        case CimPackage.CONTROL_AREA__NET_INTERCHANGE:
            return isSetNetInterchange();
        case CimPackage.CONTROL_AREA__PTOLERANCE:
            return isSetPTolerance();
        case CimPackage.CONTROL_AREA__TYPE:
            return isSetType();
        case CimPackage.CONTROL_AREA__ENERGY_AREA:
            return isSetEnergyArea();
        case CimPackage.CONTROL_AREA__TIE_FLOW:
            return isSetTieFlow();
        case CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
            return isSetControlAreaGeneratingUnit();
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
        result.append( " (netInterchange: " );
        if( netInterchangeESet )
            result.append( netInterchange );
        else
            result.append( "<unset>" );
        result.append( ", pTolerance: " );
        if( pToleranceESet )
            result.append( pTolerance );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ControlAreaImpl
