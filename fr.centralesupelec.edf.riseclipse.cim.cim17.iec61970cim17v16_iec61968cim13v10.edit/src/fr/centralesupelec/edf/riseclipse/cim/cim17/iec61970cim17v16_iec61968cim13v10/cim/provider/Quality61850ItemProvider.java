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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Quality61850;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Quality61850} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Quality61850ItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Quality61850ItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addBadReferencePropertyDescriptor( object );
            addEstimatorReplacedPropertyDescriptor( object );
            addFailurePropertyDescriptor( object );
            addOldDataPropertyDescriptor( object );
            addOperatorBlockedPropertyDescriptor( object );
            addOscillatoryPropertyDescriptor( object );
            addOutOfRangePropertyDescriptor( object );
            addOverFlowPropertyDescriptor( object );
            addSourcePropertyDescriptor( object );
            addSuspectPropertyDescriptor( object );
            addTestPropertyDescriptor( object );
            addValidityPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bad Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBadReferencePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_badReference_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_badReference_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_BadReference(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Estimator Replaced feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEstimatorReplacedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_estimatorReplaced_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_estimatorReplaced_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_EstimatorReplaced(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Failure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailurePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_failure_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_failure_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Failure(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Old Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOldDataPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_oldData_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_oldData_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_OldData(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operator Blocked feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperatorBlockedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_operatorBlocked_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_operatorBlocked_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_OperatorBlocked(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Oscillatory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOscillatoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_oscillatory_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_oscillatory_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Oscillatory(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Out Of Range feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutOfRangePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_outOfRange_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_outOfRange_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_OutOfRange(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Over Flow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverFlowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_overFlow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_overFlow_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_OverFlow(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_source_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_source_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Source(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Suspect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuspectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_suspect_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_suspect_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Suspect(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Test feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTestPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_test_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_test_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Test(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Validity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValidityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Quality61850_validity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Quality61850_validity_feature",
                                "_UI_Quality61850_type" ),
                        CimPackage.eINSTANCE.getQuality61850_Validity(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns Quality61850.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Quality61850" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Quality61850 ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_Quality61850_type" )
                : getString( "_UI_Quality61850_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( Quality61850.class ) ) {
        case CimPackage.QUALITY61850__BAD_REFERENCE:
        case CimPackage.QUALITY61850__ESTIMATOR_REPLACED:
        case CimPackage.QUALITY61850__FAILURE:
        case CimPackage.QUALITY61850__OLD_DATA:
        case CimPackage.QUALITY61850__OPERATOR_BLOCKED:
        case CimPackage.QUALITY61850__OSCILLATORY:
        case CimPackage.QUALITY61850__OUT_OF_RANGE:
        case CimPackage.QUALITY61850__OVER_FLOW:
        case CimPackage.QUALITY61850__SOURCE:
        case CimPackage.QUALITY61850__SUSPECT:
        case CimPackage.QUALITY61850__TEST:
        case CimPackage.QUALITY61850__VALIDITY:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
