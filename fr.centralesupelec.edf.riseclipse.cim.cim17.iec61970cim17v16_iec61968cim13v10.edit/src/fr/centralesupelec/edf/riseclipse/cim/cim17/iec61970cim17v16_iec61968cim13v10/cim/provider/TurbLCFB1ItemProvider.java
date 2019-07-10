/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbLCFB1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbLCFB1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TurbLCFB1ItemProvider extends TurbineLoadControllerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TurbLCFB1ItemProvider( AdapterFactory adapterFactory ) {
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

            addDbPropertyDescriptor( object );
            addEmaxPropertyDescriptor( object );
            addFbPropertyDescriptor( object );
            addFbfPropertyDescriptor( object );
            addIrmaxPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPbfPropertyDescriptor( object );
            addPmwsetPropertyDescriptor( object );
            addSpeedReferenceGovernorPropertyDescriptor( object );
            addTpelecPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Db feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_db_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_db_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Db(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Emax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_emax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_emax_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Emax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_fb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_fb_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Fb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fbf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFbfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_fbf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_fbf_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Fbf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Irmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_irmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_irmax_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Irmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_ki_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Ki(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_kp_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_mwbase_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Mwbase(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pbf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPbfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_pbf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_pbf_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Pbf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmwset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmwsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_pmwset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_pmwset_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Pmwset(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Speed Reference Governor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpeedReferenceGovernorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_speedReferenceGovernor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_speedReferenceGovernor_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_SpeedReferenceGovernor(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpelec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpelecPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TurbLCFB1_tpelec_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TurbLCFB1_tpelec_feature",
                                "_UI_TurbLCFB1_type" ),
                        CimPackage.eINSTANCE.getTurbLCFB1_Tpelec(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns TurbLCFB1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TurbLCFB1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TurbLCFB1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TurbLCFB1_type" )
                : getString( "_UI_TurbLCFB1_type" ) + " " + label;
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

        switch( notification.getFeatureID( TurbLCFB1.class ) ) {
        case CimPackage.TURB_LCFB1__DB:
        case CimPackage.TURB_LCFB1__EMAX:
        case CimPackage.TURB_LCFB1__FB:
        case CimPackage.TURB_LCFB1__FBF:
        case CimPackage.TURB_LCFB1__IRMAX:
        case CimPackage.TURB_LCFB1__KI:
        case CimPackage.TURB_LCFB1__KP:
        case CimPackage.TURB_LCFB1__MWBASE:
        case CimPackage.TURB_LCFB1__PBF:
        case CimPackage.TURB_LCFB1__PMWSET:
        case CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR:
        case CimPackage.TURB_LCFB1__TPELEC:
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
