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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Support</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getAnchorRodCount <em>Anchor Rod Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getAnchorRodLength <em>Anchor Rod Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getSize <em>Size</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureSupportImpl#getSecuredStructure <em>Secured Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureSupportImpl extends AssetImpl implements StructureSupport {
    /**
     * The default value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorRodCount()
     * @generated
     * @ordered
     */
    protected static final Integer ANCHOR_ROD_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorRodCount()
     * @generated
     * @ordered
     */
    protected Integer anchorRodCount = ANCHOR_ROD_COUNT_EDEFAULT;

    /**
     * This is true if the Anchor Rod Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean anchorRodCountESet;

    /**
     * The default value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorRodLength()
     * @generated
     * @ordered
     */
    protected static final Float ANCHOR_ROD_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorRodLength()
     * @generated
     * @ordered
     */
    protected Float anchorRodLength = ANCHOR_ROD_LENGTH_EDEFAULT;

    /**
     * This is true if the Anchor Rod Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean anchorRodLengthESet;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final Float DIRECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected Float direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final Float LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected Float length = LENGTH_EDEFAULT;

    /**
     * This is true if the Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lengthESet;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final String SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected String size = SIZE_EDEFAULT;

    /**
     * This is true if the Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeESet;

    /**
     * The cached value of the '{@link #getSecuredStructure() <em>Secured Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecuredStructure()
     * @generated
     * @ordered
     */
    protected Structure securedStructure;

    /**
     * This is true if the Secured Structure reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean securedStructureESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructureSupportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStructureSupport();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getAnchorRodCount() {
        return anchorRodCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnchorRodCount( Integer newAnchorRodCount ) {
        Integer oldAnchorRodCount = anchorRodCount;
        anchorRodCount = newAnchorRodCount;
        boolean oldAnchorRodCountESet = anchorRodCountESet;
        anchorRodCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT,
                    oldAnchorRodCount, anchorRodCount, !oldAnchorRodCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnchorRodCount() {
        Integer oldAnchorRodCount = anchorRodCount;
        boolean oldAnchorRodCountESet = anchorRodCountESet;
        anchorRodCount = ANCHOR_ROD_COUNT_EDEFAULT;
        anchorRodCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT,
                    oldAnchorRodCount, ANCHOR_ROD_COUNT_EDEFAULT, oldAnchorRodCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnchorRodCount() {
        return anchorRodCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAnchorRodLength() {
        return anchorRodLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnchorRodLength( Float newAnchorRodLength ) {
        Float oldAnchorRodLength = anchorRodLength;
        anchorRodLength = newAnchorRodLength;
        boolean oldAnchorRodLengthESet = anchorRodLengthESet;
        anchorRodLengthESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH,
                    oldAnchorRodLength, anchorRodLength, !oldAnchorRodLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnchorRodLength() {
        Float oldAnchorRodLength = anchorRodLength;
        boolean oldAnchorRodLengthESet = anchorRodLengthESet;
        anchorRodLength = ANCHOR_ROD_LENGTH_EDEFAULT;
        anchorRodLengthESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH,
                    oldAnchorRodLength, ANCHOR_ROD_LENGTH_EDEFAULT, oldAnchorRodLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnchorRodLength() {
        return anchorRodLengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDirection( Float newDirection ) {
        Float oldDirection = direction;
        direction = newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE_SUPPORT__DIRECTION, oldDirection, direction, !oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDirection() {
        Float oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE_SUPPORT__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDirection() {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLength( Float newLength ) {
        Float oldLength = length;
        length = newLength;
        boolean oldLengthESet = lengthESet;
        lengthESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE_SUPPORT__LENGTH, oldLength, length, !oldLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLength() {
        Float oldLength = length;
        boolean oldLengthESet = lengthESet;
        length = LENGTH_EDEFAULT;
        lengthESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE_SUPPORT__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLength() {
        return lengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSize( String newSize ) {
        String oldSize = size;
        size = newSize;
        boolean oldSizeESet = sizeESet;
        sizeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE_SUPPORT__SIZE, oldSize, size, !oldSizeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSize() {
        String oldSize = size;
        boolean oldSizeESet = sizeESet;
        size = SIZE_EDEFAULT;
        sizeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE_SUPPORT__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSize() {
        return sizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Structure getSecuredStructure() {
        return securedStructure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecuredStructure( Structure newSecuredStructure, NotificationChain msgs ) {
        Structure oldSecuredStructure = securedStructure;
        securedStructure = newSecuredStructure;
        boolean oldSecuredStructureESet = securedStructureESet;
        securedStructureESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE, oldSecuredStructure, newSecuredStructure,
                    !oldSecuredStructureESet );
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
    public void setSecuredStructure( Structure newSecuredStructure ) {
        if( newSecuredStructure != securedStructure ) {
            NotificationChain msgs = null;
            if( securedStructure != null ) msgs = ( ( InternalEObject ) securedStructure ).eInverseRemove( this,
                    CimPackage.STRUCTURE__STRUCTURE_SUPPORTS, Structure.class, msgs );
            if( newSecuredStructure != null ) msgs = ( ( InternalEObject ) newSecuredStructure ).eInverseAdd( this,
                    CimPackage.STRUCTURE__STRUCTURE_SUPPORTS, Structure.class, msgs );
            msgs = basicSetSecuredStructure( newSecuredStructure, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecuredStructureESet = securedStructureESet;
            securedStructureESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE,
                        newSecuredStructure, newSecuredStructure, !oldSecuredStructureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSecuredStructure( NotificationChain msgs ) {
        Structure oldSecuredStructure = securedStructure;
        securedStructure = null;
        boolean oldSecuredStructureESet = securedStructureESet;
        securedStructureESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE, oldSecuredStructure, null,
                    oldSecuredStructureESet );
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
    public void unsetSecuredStructure() {
        if( securedStructure != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) securedStructure ).eInverseRemove( this,
                    CimPackage.STRUCTURE__STRUCTURE_SUPPORTS, Structure.class, msgs );
            msgs = basicUnsetSecuredStructure( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecuredStructureESet = securedStructureESet;
            securedStructureESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE, null, null, oldSecuredStructureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecuredStructure() {
        return securedStructureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            if( securedStructure != null ) msgs = ( ( InternalEObject ) securedStructure ).eInverseRemove( this,
                    CimPackage.STRUCTURE__STRUCTURE_SUPPORTS, Structure.class, msgs );
            return basicSetSecuredStructure( ( Structure ) otherEnd, msgs );
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
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            return basicUnsetSecuredStructure( msgs );
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
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
            return getAnchorRodCount();
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
            return getAnchorRodLength();
        case CimPackage.STRUCTURE_SUPPORT__DIRECTION:
            return getDirection();
        case CimPackage.STRUCTURE_SUPPORT__LENGTH:
            return getLength();
        case CimPackage.STRUCTURE_SUPPORT__SIZE:
            return getSize();
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            return getSecuredStructure();
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
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
            setAnchorRodCount( ( Integer ) newValue );
            return;
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
            setAnchorRodLength( ( Float ) newValue );
            return;
        case CimPackage.STRUCTURE_SUPPORT__DIRECTION:
            setDirection( ( Float ) newValue );
            return;
        case CimPackage.STRUCTURE_SUPPORT__LENGTH:
            setLength( ( Float ) newValue );
            return;
        case CimPackage.STRUCTURE_SUPPORT__SIZE:
            setSize( ( String ) newValue );
            return;
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            setSecuredStructure( ( Structure ) newValue );
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
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
            unsetAnchorRodCount();
            return;
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
            unsetAnchorRodLength();
            return;
        case CimPackage.STRUCTURE_SUPPORT__DIRECTION:
            unsetDirection();
            return;
        case CimPackage.STRUCTURE_SUPPORT__LENGTH:
            unsetLength();
            return;
        case CimPackage.STRUCTURE_SUPPORT__SIZE:
            unsetSize();
            return;
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            unsetSecuredStructure();
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
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
            return isSetAnchorRodCount();
        case CimPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
            return isSetAnchorRodLength();
        case CimPackage.STRUCTURE_SUPPORT__DIRECTION:
            return isSetDirection();
        case CimPackage.STRUCTURE_SUPPORT__LENGTH:
            return isSetLength();
        case CimPackage.STRUCTURE_SUPPORT__SIZE:
            return isSetSize();
        case CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
            return isSetSecuredStructure();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (anchorRodCount: " );
        if( anchorRodCountESet )
            result.append( anchorRodCount );
        else
            result.append( "<unset>" );
        result.append( ", anchorRodLength: " );
        if( anchorRodLengthESet )
            result.append( anchorRodLength );
        else
            result.append( "<unset>" );
        result.append( ", direction: " );
        if( directionESet )
            result.append( direction );
        else
            result.append( "<unset>" );
        result.append( ", length: " );
        if( lengthESet )
            result.append( length );
        else
            result.append( "<unset>" );
        result.append( ", size: " );
        if( sizeESet )
            result.append( size );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StructureSupportImpl
