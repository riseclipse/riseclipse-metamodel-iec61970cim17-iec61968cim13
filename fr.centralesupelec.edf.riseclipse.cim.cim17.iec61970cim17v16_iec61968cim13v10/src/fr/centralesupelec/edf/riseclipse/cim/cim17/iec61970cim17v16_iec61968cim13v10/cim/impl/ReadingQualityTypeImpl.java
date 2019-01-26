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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType;

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
 * An implementation of the model object '<em><b>Reading Quality Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityTypeImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityTypeImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityTypeImpl#getReadingQualities <em>Reading Qualities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingQualityTypeImpl extends IdentifiedObjectImpl implements ReadingQualityType {
    /**
     * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected static final String CATEGORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected String category = CATEGORY_EDEFAULT;

    /**
     * This is true if the Category attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean categoryESet;

    /**
     * The default value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCategory()
     * @generated
     * @ordered
     */
    protected static final String SUB_CATEGORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCategory()
     * @generated
     * @ordered
     */
    protected String subCategory = SUB_CATEGORY_EDEFAULT;

    /**
     * This is true if the Sub Category attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subCategoryESet;

    /**
     * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemId()
     * @generated
     * @ordered
     */
    protected static final String SYSTEM_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemId()
     * @generated
     * @ordered
     */
    protected String systemId = SYSTEM_ID_EDEFAULT;

    /**
     * This is true if the System Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean systemIdESet;

    /**
     * The cached value of the '{@link #getReadingQualities() <em>Reading Qualities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingQualities()
     * @generated
     * @ordered
     */
    protected EList< ReadingQuality > readingQualities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadingQualityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReadingQualityType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCategory() {
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCategory( String newCategory ) {
        String oldCategory = category;
        category = newCategory;
        boolean oldCategoryESet = categoryESet;
        categoryESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY_TYPE__CATEGORY, oldCategory, category, !oldCategoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCategory() {
        String oldCategory = category;
        boolean oldCategoryESet = categoryESet;
        category = CATEGORY_EDEFAULT;
        categoryESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_QUALITY_TYPE__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCategory() {
        return categoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubCategory( String newSubCategory ) {
        String oldSubCategory = subCategory;
        subCategory = newSubCategory;
        boolean oldSubCategoryESet = subCategoryESet;
        subCategoryESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY, oldSubCategory, subCategory, !oldSubCategoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubCategory() {
        String oldSubCategory = subCategory;
        boolean oldSubCategoryESet = subCategoryESet;
        subCategory = SUB_CATEGORY_EDEFAULT;
        subCategoryESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY,
                    oldSubCategory, SUB_CATEGORY_EDEFAULT, oldSubCategoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubCategory() {
        return subCategoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSystemId() {
        return systemId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSystemId( String newSystemId ) {
        String oldSystemId = systemId;
        systemId = newSystemId;
        boolean oldSystemIdESet = systemIdESet;
        systemIdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY_TYPE__SYSTEM_ID, oldSystemId, systemId, !oldSystemIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSystemId() {
        String oldSystemId = systemId;
        boolean oldSystemIdESet = systemIdESet;
        systemId = SYSTEM_ID_EDEFAULT;
        systemIdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_QUALITY_TYPE__SYSTEM_ID, oldSystemId, SYSTEM_ID_EDEFAULT, oldSystemIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSystemId() {
        return systemIdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReadingQuality > getReadingQualities() {
        if( readingQualities == null ) {
            readingQualities = new EObjectWithInverseResolvingEList.Unsettable< ReadingQuality >( ReadingQuality.class,
                    this, CimPackage.READING_QUALITY_TYPE__READING_QUALITIES,
                    CimPackage.READING_QUALITY__READING_QUALITY_TYPE );
        }
        return readingQualities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadingQualities() {
        if( readingQualities != null ) ( ( InternalEList.Unsettable< ? > ) readingQualities ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingQualities() {
        return readingQualities != null && ( ( InternalEList.Unsettable< ? > ) readingQualities ).isSet();
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
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReadingQualities() )
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
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            return ( ( InternalEList< ? > ) getReadingQualities() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.READING_QUALITY_TYPE__CATEGORY:
            return getCategory();
        case CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY:
            return getSubCategory();
        case CimPackage.READING_QUALITY_TYPE__SYSTEM_ID:
            return getSystemId();
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            return getReadingQualities();
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
        case CimPackage.READING_QUALITY_TYPE__CATEGORY:
            setCategory( ( String ) newValue );
            return;
        case CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY:
            setSubCategory( ( String ) newValue );
            return;
        case CimPackage.READING_QUALITY_TYPE__SYSTEM_ID:
            setSystemId( ( String ) newValue );
            return;
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            getReadingQualities().clear();
            getReadingQualities().addAll( ( Collection< ? extends ReadingQuality > ) newValue );
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
        case CimPackage.READING_QUALITY_TYPE__CATEGORY:
            unsetCategory();
            return;
        case CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY:
            unsetSubCategory();
            return;
        case CimPackage.READING_QUALITY_TYPE__SYSTEM_ID:
            unsetSystemId();
            return;
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            unsetReadingQualities();
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
        case CimPackage.READING_QUALITY_TYPE__CATEGORY:
            return isSetCategory();
        case CimPackage.READING_QUALITY_TYPE__SUB_CATEGORY:
            return isSetSubCategory();
        case CimPackage.READING_QUALITY_TYPE__SYSTEM_ID:
            return isSetSystemId();
        case CimPackage.READING_QUALITY_TYPE__READING_QUALITIES:
            return isSetReadingQualities();
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
        result.append( " (category: " );
        if( categoryESet )
            result.append( category );
        else
            result.append( "<unset>" );
        result.append( ", subCategory: " );
        if( subCategoryESet )
            result.append( subCategory );
        else
            result.append( "<unset>" );
        result.append( ", systemId: " );
        if( systemIdESet )
            result.append( systemId );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReadingQualityTypeImpl
