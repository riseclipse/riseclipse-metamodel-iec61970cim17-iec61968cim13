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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC1A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC1A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEDC1AItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEDC1AItemProvider( AdapterFactory adapterFactory ) {
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

            addEfd1PropertyDescriptor( object );
            addEfd2PropertyDescriptor( object );
            addExclimPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addSeefd1PropertyDescriptor( object );
            addSeefd2PropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addUelinPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_efd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_efd1_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Efd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efd2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_efd2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_efd2_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Efd2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Exclim feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExclimPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_exclim_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_exclim_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Exclim(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_ka_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_ke_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Ke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_kf_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Kf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seefd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeefd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_seefd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_seefd1_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Seefd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seefd2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeefd2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_seefd2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_seefd2_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Seefd2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_ta_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_tb_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_tc_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_te_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Te(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_tf_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uelin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUelinPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_uelin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_uelin_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Uelin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_vrmax_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Vrmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC1A_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC1A_vrmin_feature",
                                "_UI_ExcIEEEDC1A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC1A_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcIEEEDC1A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEDC1A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEDC1A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEDC1A_type" )
                : getString( "_UI_ExcIEEEDC1A_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEDC1A.class ) ) {
        case CimPackage.EXC_IEEEDC1A__EFD1:
        case CimPackage.EXC_IEEEDC1A__EFD2:
        case CimPackage.EXC_IEEEDC1A__EXCLIM:
        case CimPackage.EXC_IEEEDC1A__KA:
        case CimPackage.EXC_IEEEDC1A__KE:
        case CimPackage.EXC_IEEEDC1A__KF:
        case CimPackage.EXC_IEEEDC1A__SEEFD1:
        case CimPackage.EXC_IEEEDC1A__SEEFD2:
        case CimPackage.EXC_IEEEDC1A__TA:
        case CimPackage.EXC_IEEEDC1A__TB:
        case CimPackage.EXC_IEEEDC1A__TC:
        case CimPackage.EXC_IEEEDC1A__TE:
        case CimPackage.EXC_IEEEDC1A__TF:
        case CimPackage.EXC_IEEEDC1A__UELIN:
        case CimPackage.EXC_IEEEDC1A__VRMAX:
        case CimPackage.EXC_IEEEDC1A__VRMIN:
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
